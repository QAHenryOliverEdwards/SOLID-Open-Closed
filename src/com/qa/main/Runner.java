package com.qa.main;

public class Runner {

    public static void main(String[] args) {
        Greeter greeter = new Greeter(new CasualGreeting());
        System.out.println(greeter.greet());

        Greeter greeter1 = new Greeter(new PoliteGreeting());
        System.out.println(greeter1.greet());
    }
}
