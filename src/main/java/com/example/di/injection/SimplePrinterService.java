package com.example.di.injection;

public class SimplePrinterService implements PrinterService {
    public void print(String message) {
        System.out.println(message);
    }
}
