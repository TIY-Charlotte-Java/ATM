package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by emileenmarianayagam on 12/1/16.
 */
public class Transaction {

    static double balance = 100;


    public double getBalance() {
        return balance;
    }


    public void printBalance() {
        System.out.println("your balance is " + balance);
    }


    public void amountWithdrawn() throws Exception {

        double amountWanted;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of fund you would like to withdraw");
        amountWanted = input.nextDouble();

        if (amountWanted > balance) {
            throw new Exception("you want more than what you have... too greedy");
        } else if (amountWanted > 0 && amountWanted <= balance) {
             balance = balance - amountWanted;
            System.out.println("Your balance after your withdrawl is " + balance);
        } else {
            System.out.println("Thank you and come again");
        }
    }
}
