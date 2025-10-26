package com.java.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**program is a set of instructions;
 * Exception is a event that occurs during execution of program which interepts the normal flow of instructions
 * if Exception occurs ,it creates Exception Object and contains information: 
 * 
 * 		1.Type of Exception and message
 * 		2.Stack trace 
 * 
 * Runtime System terminates the program and calls the stack trace .
 * 
 * 
 ***->Exception Hierarchy
 * 
 * Object
 * 
 * Throwable
 * 	 		
 * 1.Error(JVM throws this error during memory alloc.)   		  
 * 
 * 			a.StackOverflowError(Infinite Recurrion)   				
 *  		b.OutOfMemoryError(Array size) 																	
 * 
 * 2.Exception(Respected to our code have some certain control over them
 * 	
 * 			(i).Runtime Exception @Unchecked (Compiler not force us to hanlde this Exceptions 
 * 										since this exceptions occur during execution of program not while compiling)
 *		 				
 * 				a)ClassCastException
 * 				b)IndexOutOfBound
 * 				c)NullPointException
 * 				d)ArithmaticException
 * 				e)IllegalArgumentException
 * 
 * 			(ii).CompileTime Exceptions @Checked (Compiler verifies them during the compile time of the code and 
 * 													if not handled properly,code compilation fails(forces us to handle this error))
 * 
 * 
 *(Javac gives exception . @compilation fails)
 * 				
 * 				a)ClassNotFoundException
 * 				b)InterruptedException
 * 				c)IOException
 * 				d)SQLException
 * 
 * 
 * 
 * Throws allows to throw Exception but caller has to handle it.(Delegates)
 * 
 * Either to throw Exception or handle it
 * 
 * try/catch and finally is where we actually handle the Exception
 * 		1.It should be followed by either catch or finally or else it gives error.( @try/catch,@try/finally,@try/catch/finally)
 * 		2.We can only add 1 finally block
 * 		3.Finally block not be executed only if something error occurs from jvm due to memory issue,System.exit() or our process is forcefully killed.
 * 
 * try,catch,finally,throw,throws used for handling Exceptions
 * 
 * throw is where we throw the new exception or re throw the exception(in catch block)
 * 
 * 
 **/

public class ExceptionHandling {

	public static void main(String[] args) throws ClassNotFoundException  {
		ExceptionHandling obj=new ExceptionHandling();
		
//		//-------Runtime Exception---------//
//		obj.classCastException();   //No issue with not handling throw.
////Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
////		at com.java.practice.ExceptionHandling.classCastException(ExceptionHandling.java:114)
////		at com.java.practice.ExceptionHandling.main(ExceptionHandling.java:72)
//
//		obj.indexOutOfBoundException();
//		obj.nullPointExeption();
//		obj.arithmaticException();
//		obj.illegalArgumentException();
		
		
		
		//-------CompileTime Exception-----//
		
		
		System.out.println(100000);
		obj.classNotFoundException(); //issue with Compiler for not handling . 

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Unhandled exception type ClassNotFoundException

//		at com.java.practice.ExceptionHandling.classNotFoundException(ExceptionHandling.java:149)
//		at com.java.practice.ExceptionHandling.main(ExceptionHandling.java:88)

		
//		Note : If throws is not used ,that method will not cause problem 
				//even if it shows error symbol inside method until invoking it
				//and above methods will be run;

		
		try {
			obj.tryCatch1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			obj.tryCatch2("IOException");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
//		catch(SQLException ex) {//Unreachable catch block for SQLException. This exception is never thrown from the try statement body
//			
//		}
		
		//--------Custom Exception-------------//
		
		try {
			obj.customException("Custom Exception thrown");
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void classCastException() {
		Object val=0;
		System.out.println((String)val);
//		throw new ClassCastException();//Compiler not forcing us to handle this Exception
	}
	
	private void indexOutOfBoundException() {
		
		int [] val=new int[2];
		System.out.println(val[3]);
	}
	
	private void nullPointExeption() {
		String value=null;
		System.out.println(value.equals("UnKnown"));
		
	}
	
	private void arithmaticException()  {
		int res=5/0;
		System.out.println(res);
	}
	
	private void illegalArgumentException() {
		int value=Integer.valueOf("UnKnown");
		System.out.println(value);
	}
	
	private void classNotFoundException() throws ClassNotFoundException  {//@throws tells that method might or might not throw Exception.
																			//It tells Caller method to handle it.
		System.out.println(8);
		throw new ClassNotFoundException();//Compiler forces us to handle this Exceptions(shows Error if throws not used in method signature).
	}
	
	private void tryCatch1() throws ClassNotFoundException {
		System.out.println(8);
		throw new ClassNotFoundException(); // Either use throws or handle in catch block in caller method
	}
	
	private void tryCatch2(String name) throws IOException,InterruptedException {
		
		System.out.println(8);
		if(name.equals("IOException")) {
			throw new IOException();
		}else if(name.equals("InterruptedException")) {
			throw new InterruptedException(); 
		}
	}
	
	
	private void customException(String name) throws MyCustomException {
		throw new MyCustomException(name);
	}
	
	
	
}
class MyCustomException extends Exception{
	public MyCustomException(String name) {
		super(name);
	}
}
/**
 * Why we need to handle Exceptions in first place????
 * 		1.It makes our code clean by seperating Error handling code from regular code.
 * 		2.It allows program to recover from the errors.
 * 		3.It allows us to add more information,which supports debugging.
 * 		4.Improves security,By hiding sensitive information 
 *
**/