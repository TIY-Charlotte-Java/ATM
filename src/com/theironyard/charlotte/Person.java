package com.theironyard.charlotte;

import java.util.Scanner;
/**
 * Created by Ben on 12/1/16.
 */
public class Person {

    private String name;

    private static final Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectName() throws Exception{
        System.out.println("Enter Name:");

        String name = scanner.nextLine();

        if (name != null && name.length() > 0) {
            System.out.println("Welcome " + name);
        } else {
            throw new Exception("Must Enter Name");
        }
    }
}
