package org.example;

public class Greeter {

    public String greet(String name) {
        if(name.isEmpty()){
            name = "world";
        }
        return "Hello, " + name + "!";
    }
}