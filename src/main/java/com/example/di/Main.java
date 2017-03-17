package com.example.di;

import com.example.di.injection.InjectedUser;
import com.example.di.injection.SimplePrinterService;
import com.example.di.traditional.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.say("Something");

        InjectedUser injectedUser = new InjectedUser(new SimplePrinterService());
        injectedUser.say("I was injected something");
    }
}
