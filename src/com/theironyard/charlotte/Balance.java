package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by Ben on 12/1/16.
 */
public class Balance {
    private double balance = 100.00;
    private double withdrawAmount;

    public void currentBalance() {
        balance = 100.00;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public void displayBalance() {
        System.out.println("Your current balance is " + balance);
    }

    public void selectWithdrawAmount() throws Exception{
        System.out.println("Enter desired withdraw amount 1: $20, 2: $40, 3: $60, 4: $80, 5: $100");

        String withdraw = scanner.nextLine();
        if (withdraw.equals ("1") && balance >= 20) {
            System.out.println("Withdrawing $20...");
            balance = balance - 20;
            System.out.println("Withdraw Successful. Balance remaining " + balance);
        }
        else if (withdraw.equals("2") && balance >= 40) {
            System.out.println("Withdrawing $40...");
            balance = balance - 40;
            System.out.println("Withdraw Successful. Balance remaining " + balance);
        }
        else {
            if (withdraw.equals("3") && balance >= 60) {
                System.out.println("Withdrawing $60...");
                balance = balance - 60;
                System.out.println("Withdraw Successful. Balance remaining " + balance);
            }
            else if (withdraw.equals("4") && balance >= 80) {
                System.out.println("Withdrawing $80...");
                balance = balance - 80;
                System.out.println("Withdraw Successful. Balance remianing " + balance);

            }
            else {
                if (withdraw.equals("5") && balance >= 100) {
                    System.out.println("Withdrawing $100...");
                    balance = balance - 100;
                    System.out.println("Withdraw Successful. Balance remianing " + balance);
                }
                else {
                    throw new Exception("Insufficient Funds. Please select another amount.");
                }
            }
        }
    }

    public void selectDepositAmount() throws Exception {
        System.out.println("Select desired deposit amount.");
        System.out.println("1. $20");
        System.out.println("2. $40");
        System.out.println("3. $60");
        System.out.println("4. $80");
        System.out.println("5. $100");

        String deposit = scanner.nextLine();
        if (deposit.equals ("1")) {
            System.out.println("Depositing $20...");
            balance = balance + 20;
            System.out.println("Deposit Successful. Balance remaining " + balance);
        }
        else if (deposit.equals("2")) {
            System.out.println("Depositing $40...");
            balance = balance + 40;
            System.out.println("Deposit Successful. Balance remaining " + balance);
        }
        else {
            if (deposit.equals("3")) {
                System.out.println("Depositing $60...");
                balance = balance + 60;
                System.out.println("Deposit Successful. Balance remaining " + balance);
            } else if (deposit.equals("4")) {
                System.out.println("Depositing $80...");
                balance = balance + 80;
                System.out.println("Deposit Successful. Balance remaining " + balance);

            } else {
                if (deposit.equals("5")) {
                    System.out.println("Depositing $100...");
                    balance = balance + 100;
                    System.out.println("Deposit Successful. Balance remaining " + balance);
                } else {
                    throw new Exception("Invalid deposit. Please try again.");
                }
            }
        }
    }
}
