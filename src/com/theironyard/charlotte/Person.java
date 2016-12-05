package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by emileenmarianayagam on 12/1/16.
 */
public class Person {

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createPerson() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        name = input.nextLine();

        if (!name.equals("")) {
            System.out.println("Welcome " + name);

        } else {
            throw new Exception("you have a blank entry -- cant accept");
        }
    }
}


