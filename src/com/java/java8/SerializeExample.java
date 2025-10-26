package com.java.java8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializeExample {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe",100,5000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Serialization complete");
          
            System.out.println(Paths.get("employee.ser").toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
