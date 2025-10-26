package com.java.Exp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrCode extends Thread {

	@Override
	public void run() {
		
		
//		for(int i=0;i<=2500;i=i+500) {
			
			int amount=5000;
			new Thread() {
				@Override
				public void run() {
					try {
						generateQrCode("QrCode", "{UpiId}",amount);
					} catch (Exception e) {
					}
				}
			}.start();;
			
//		}
		
		
	}

	public static synchronized void generateQrCode(String type, String upiId, int amount) throws WriterException, IOException {
		
		
		String amountConcat="";
		if(amount!=1) {
			amountConcat="&am=" + amount + "";
			
		}
		String vpa = upiId;
		String currency = "INR";
		String text = "upi://pay?pa=" + vpa + ""+amountConcat+"&tn=Transaction of Funds $ " + amount + "&cu="
				+ currency;
		int width = 400;
		int height = 400;
		String format = "png";

		String filePath = "" + type + ".png";

		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

		MatrixToImageWriter.writeToPath(bitMatrix, format, Paths.get(filePath));

		File file = new File(filePath);

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		// Create a mail session with authentication
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("rbchowdary1507@gmail.com", "sofv ywif jnce aomh");
			}
		});

		try {
			
			// Create the email message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("rbchowdary1507@gmail.com"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress("ravillabhanu143@gmail.com"));
			msg.setSubject("Qr Code Image");

			// Create the email body part
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Please find the QR code " + (amountConcat.isEmpty() ? "" : "for the Amount of " + amount) + " attached.");

			// Attach the QR code
			MimeBodyPart attachmentBodyPart = new MimeBodyPart();
			attachmentBodyPart.attachFile(file);

			// Combine parts into a multipart
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(textBodyPart);
			multipart.addBodyPart(attachmentBodyPart);

			msg.setContent(multipart);
			// Send the email
			Transport.send(msg);

			System.out.println("Email sent successfully!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

//	    System.out.println(Paths.get(filePath).toAbsolutePath());
//	    System.out.println(Paths.get(file.getAbsolutePath()));

	}

	public static void main(String[] args) {

		Thread thread = new QrCode();

		thread.start();

	}
}