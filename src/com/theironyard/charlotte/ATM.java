package com.theironyard.charlotte;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TIY Bank and Trust. Please enter your name.");
        p.selectName();

        Balance b = new Balance();

        String selectChoice;

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Cancel");
            selectChoice = scanner.nextLine();

            if (selectChoice.equals("1")) {
                b.displayBalance();
            } else if (selectChoice.equals("2")) {
                b.selectWithdrawAmount();
            } else {
                if (selectChoice.equals("3")) {
                    b.selectDepositAmount();
                }
                else if (selectChoice.equals("4")) {
                    System.out.println("Have a nice day. Goodbye.");
                    System.exit(0);
                }
            }
        }
        while (selectChoice !="4");
    }
}