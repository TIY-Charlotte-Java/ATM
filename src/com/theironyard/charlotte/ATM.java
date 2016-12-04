package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by guest on 12/1/16.
 */
public class ATM {
    private double balance = 100;

    private static final Scanner scanner = new Scanner(System.in);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void selectTask() throws Exception {
        System.out.println("What would you like to do? Select 1 - check balance, 2 - make a withdrawal or 3 - cancel");
        String task = scanner.nextLine();

        if (task.equals("1")) {
            System.out.println(getBalance());
        } else if (task.equals("2")) {
            makeWithdrawal();
        } else if (task.equals("3")) {
            System.out.println("Thank you. Please come again.");
            exitProgram();
        } else {
            throw new Exception ("Invalid selection. Please try again.");
        }

    }

    public double makeWithdrawal() throws Exception {
        System.out.println("How much would you like to withdraw?");
        Double withdrawal = scanner.nextDouble();

        if (withdrawal > 0 && withdrawal <= 100){
            System.out.println("Please take your money.");
            setBalance(balance - withdrawal);
            System.out.println("Remaining balance is $" + getBalance());
            return balance;
        } else {
            throw new Exception("Insufficient funds. Please try again.");
        }
    }

    public void exitProgram() {
        System.exit(0);
    }
}

