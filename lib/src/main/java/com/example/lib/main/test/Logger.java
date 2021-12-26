package com.example.lib.main.test;

public class Logger implements ILogger {

    @Override
    public void error(String message, Exception ex) {
        System.out.println(message + "error = " + ex);
    }

    @Override
    public void debug(String message) {
        System.out.println(message);
    }
}
