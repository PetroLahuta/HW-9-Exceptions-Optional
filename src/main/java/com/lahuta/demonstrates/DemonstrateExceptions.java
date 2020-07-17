package main.java.com.lahuta.demonstrates;

import main.java.com.lahuta.exceptions.ExceptionA;
import main.java.com.lahuta.exceptions.ExceptionB;

import java.io.IOException;

public class DemonstrateExceptions {
    public void showExceptionA() {
        System.out.println("\n--------------------------------------------------" + "\nTask 1 ");
        try {
            throw new ExceptionA("ExceptionA consrtuctor String");
        } catch (ExceptionA exceptionA) {
            System.out.println("1.1. It is Exception A;");
        }
    }

    public void showExceptionB() {
        try {
            throw new ExceptionB("ExceptionB consrtuctor String");
        } catch (ExceptionB exceptionA) {
            System.out.println("1.2. It is Exception B;");
        }
    }

    public void showNullPointer() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("1.3. It is Null Pointer Exception;");
        }
    }

    public void showIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("1.4. It is IOException;" + "\n--------------------------------------------------");
        }
    }
}