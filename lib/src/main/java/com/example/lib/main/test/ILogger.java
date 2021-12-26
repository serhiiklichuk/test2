package com.example.lib.main.test;

public interface ILogger {

    void error(String message, Exception ex);

    void debug(String message);
}
