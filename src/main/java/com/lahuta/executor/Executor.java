package main.java.com.lahuta.executor;

import main.java.com.lahuta.demonstrates.DemonstrateExceptions;
import main.java.com.lahuta.division.SafeDivision;
import main.java.com.lahuta.rethrowingExceptions.RethrowingExceptions;

import java.io.FileNotFoundException;

public class Executor {
    public static void start() {
        DemonstrateExceptions demonstrateExceptions = new DemonstrateExceptions();
        demonstrateExceptions.showExceptionA();
        demonstrateExceptions.showExceptionB();
        demonstrateExceptions.showNullPointer();
        demonstrateExceptions.showIOException();

        SafeDivision safeDivision = new SafeDivision();
        safeDivision.resultsOfdivision();

        RethrowingExceptions rethrowingExceptions = new RethrowingExceptions();
        try {
            rethrowingExceptions.someMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}