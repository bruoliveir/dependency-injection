package com.example.di.traditional;

public class User {
    private Printer printer = new Printer();

    public void say(String message) {
        printer.print(message);
    }
}
