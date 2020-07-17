package main.java.com.lahuta.rethrowingExceptions;

import java.io.FileNotFoundException;

public class RethrowingExceptions {
    public void someMethod() throws FileNotFoundException {
        System.out.println("Task 3");
        someMethod2();
    }

    public void someMethod2() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}