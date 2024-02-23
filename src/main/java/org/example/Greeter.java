package org.example;

public class Greeter {

    public String greet(String name) {
        if(name.isEmpty()){
            name = "GitHub Actions with Test?";
        }
        return "Hello, " + name + "!";
    }
}
