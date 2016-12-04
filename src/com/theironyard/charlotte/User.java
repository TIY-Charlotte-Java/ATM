package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by graceconnelly on 12/1/16.
 */
public class User {

    private String name;
//Call up scanner
    private static final Scanner scanner = new Scanner(System.in);
//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//Method
    public void chooseName() throws Exception{
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        if (name.equals("")){
            throw new Exception("Failed to enter a name");
        }
        else {
            System.out.println("Welcome, " + name);
        }
    }
}
