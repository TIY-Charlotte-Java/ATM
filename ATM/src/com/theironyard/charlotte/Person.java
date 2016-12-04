package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by Joe on 12/1/16.
 */
public class Person {
    private String name;
    private double balance = 100;
    private double amount;

    public static final Scanner scanner = new Scanner(System.in);

    public void selectName() throws Exception {

        System.out.println("Welcome to the ATM. Please enter your name.");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new Exception("You need to enter a name.");
        } else
            System.out.println("Greetings, " + name);
    }

    public void selectChoice() throws Exception {

        System.out.println(" 1: Check my balance.");
        System.out.println(" 2: Withdraw funds.");
        System.out.println(" 3: Cancel.");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")) {
            System.out.println("Your Balance is. " + (balance - amount));
        }
        else if (choice.equalsIgnoreCase("2")) {
            System.out.println("How much would you like to withdraw?");

            Scanner sscanner = new Scanner(System.in);
            amount = sscanner.nextDouble();

            if (balance >= amount) {
                System.out.println("Please take your money.");
                System.out.println("Your balance is $" + (balance - amount));
                balance = (balance - amount);
            }
            else {
                throw new Exception("INSUFFICIENT FUNDS.");
            }
            selectChoice();
        }
        else if (choice.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again.");
        } else {
            throw new Exception("Does not compute.");
        }
    }
}

