package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int balance = 100, withdraw;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Thank you for choosing this crappy ATM");

               System.out.println("Please enter your name.");
               String name = scanner.nextLine();
            while(name.isEmpty())
            {
                throw new IllegalArgumentException("No name means no money");
            }

            System.out.println("Welcome, " + name);


        while(true) {
            System.out.println("Please select a transaction");
            System.out.println("Choose 1 for Balance Inquiry");
            System.out.println("Choose 2 to make a withdraw");
            System.out.println("Choose 3 to cancel");
            System.out.print("Please choose your transaction by pressing 1,2, or 3");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("How much would you like to withdraw");
                    withdraw = scanner.nextInt();
                    balance = balance - withdraw;
                    System.out.println("");
                    System.out.println("Pleas take your cash and DO NOT FORGET TO GET YOUR CARD!!!");
                    break;

                case 3:
                    System.out.println("Thank you" + name + "Enjoy the rest of your day");
                    System.exit(0);


            }
        }
    }
}
