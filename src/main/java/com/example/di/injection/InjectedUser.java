package com.example.di.injection;

public class InjectedUser {
    private PrinterService printerService;

    public InjectedUser(PrinterService printerService) {
        this.printerService = printerService;
    }

    public void say(String message) {
        printerService.print(message);
    }
}
