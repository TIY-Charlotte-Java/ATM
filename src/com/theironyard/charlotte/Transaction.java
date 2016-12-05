package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by graceconnelly on 12/1/16.
 */
public class Transaction {

    private double balance = 100;
    private double withdrawalAmt;
    private int selection;

    private static final Scanner scanner = new Scanner(System.in);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawalAmt() {
        return withdrawalAmt;
    }

    public void setWithdrawalAmt(double withdrawalAmt) {
        this.withdrawalAmt = withdrawalAmt;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    //Methods
    public void chooseEvent() throws Exception {
        System.out.println("Please, select the number for what you would like to do.");
        System.out.println("1) Check Balance");
        System.out.println("2) Withdraw Funds");
        System.out.println("3) Cancel");
        setSelection(scanner.nextInt());
    }

    public void withdrawFunds() throws Exception {
        System.out.println("How much would you like to withdraw?");
        //Get and round
        setWithdrawalAmt(Math.round(scanner.nextDouble() *(double)100));
        setWithdrawalAmt(getWithdrawalAmt() /(double)100);
        System.out.println("Processing request to withdraw: $" + getWithdrawalAmt());

        if (withdrawalAmt > balance) {
            throw new Exception("YOU AIN'T GOT THAT MUCH MULAH! a.k.a. There isn't that much cheddar in your cheese shop.");
        } else if (withdrawalAmt < 0) {
            throw new Exception("You cannot withdraw negative money");
        } else {
            setBalance(balance - withdrawalAmt);
            Transaction.correctCoinage(withdrawalAmt);
            System.out.println("Please remove your Cash Money!");
            System.out.println("Your remaining balance is $" + balance);

        }
    }

//    public static void correctCoinage(double withdrawalAmt) {
//        double totalBills = 0;
//        double[][] coinage = {
//                {100, 20, 10, 5, 1, 0.25, 0.10, 0.05, 0.01},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0}};
//        String[] coinageName = {"One Hundred dollar bills", "Twenty dollar bill(s)", "Ten dollar bill(s)", "Five dollar bills(s)", "One dollar bills",
//                "Quarter(s)", "Dime(s)", "Nickel(s)", "Penny(ies)"};
//        //This code breaks down monies received
//        System.out.println("You have received $" + withdrawalAmt + " broken down by:");
//        for (int i = 0; i < coinage[0].length; i++) {
//            totalBills = totalBills*(double)100;
//            totalBills = Math.round(totalBills);
//            totalBills = totalBills/(double)100;
//
//            coinage[1][i] = Math.floor((withdrawalAmt - totalBills) / coinage[0][i]);
//            totalBills = (totalBills + (coinage[1][i] * coinage[0][i]));
//            if (coinage[1][i] != 0) {
//                System.out.println(coinage[1][i] + "  " +coinageName[i]);
//            }
//        }
    public static void correctCoinage(double withdrawalAmt) {
        double totalBills = 0;

        int[][] coinage = {
                {10000, 2000, 1000, 500, 100, 25, 10, 5, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};

        String[] coinageName = {"One Hundred dollar bills", "Twenty dollar bill(s)", "Ten dollar bill(s)", "Five dollar bills(s)", "One dollar bills",
                "Quarter(s)", "Dime(s)", "Nickel(s)", "Penny(ies)"};
        //This code breaks down monies received
        System.out.println("You have received $" + (withdrawalAmt) + " broken down by:");
        for (int i = 0; i < coinage[0].length; i++) {

            totalBills = totalBills*(double)100;
            totalBills = Math.round(totalBills);
            totalBills = totalBills/(double)100;

            coinage[1][i] = (int)((withdrawalAmt*100 - totalBills) / coinage[0][i]);
            totalBills = (totalBills + (coinage[1][i] * coinage[0][i]));
            if (coinage[1][i] != 0) {
                System.out.println(coinage[1][i] + "  " +coinageName[i]);
            }
        }
    }
}
