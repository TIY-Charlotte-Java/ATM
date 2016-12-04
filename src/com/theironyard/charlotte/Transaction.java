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
    public void chooseEvent() throws Exception{
        System.out.println("Please, select the number for what you would like to do.");
        System.out.println("1) Check Balance");
        System.out.println("2) Withdraw Funds");
        System.out.println("3) Cancel");
        setSelection(scanner.nextInt());
        }

    public void withdrawFunds() throws Exception{
        System.out.println("How much would you like to withdraw?");
        //Get and round
        setWithdrawalAmt(Math.round(scanner.nextDouble()*100));
        setWithdrawalAmt(getWithdrawalAmt()/100);
        System.out.println("Processing request to withdraw: $" + getWithdrawalAmt());

        if(withdrawalAmt >balance){
            throw new Exception("YOU AIN'T GOT THAT MUCH MULAH! a.k.a. There isn't that much cheddar in your cheese shop.");
        }
        else if (withdrawalAmt <0){
            throw new Exception("You cannot withdraw negative money");
        }
        else {
            setBalance(balance - withdrawalAmt);
            Transaction.correctCoinage(withdrawalAmt);
            System.out.println("Please remove your Cash Money!");
            System.out.println("Your remaining balance is $" + balance);

        }
    }

   public static void correctCoinage(double withdrawalAmt){
       double dollars = Math.floor(withdrawalAmt);
       double change = withdrawalAmt - dollars;
       double totalBills;
       double totalChange;

       //This code breaks down dollar bills received
       double hundreds = Math.floor(dollars / 100);
       totalBills = hundreds * 100;
       double twenties = Math.floor((dollars - totalBills) / 20);
       totalBills = totalBills + (twenties * 20);
       double tens = Math.floor((dollars - totalBills)/ 10);
       totalBills = totalBills + (tens * 10);
       double fives = Math.floor((dollars - totalBills)/5);
       totalBills = totalBills + (fives * 5);
       double ones = Math.floor(dollars - totalBills);
       totalBills = totalBills + ones;
       System.out.println("You have received $ "+ totalBills + " broken down by:");
       if ( hundreds != 0){
           System.out.println(hundreds + " one hundred dollar bill(s)");
       }
       if (twenties !=0){
           System.out.println(twenties + " twenty dollar bill(s)");
       }
       if (tens != 0){
           System.out.println(tens + " ten dollar bill(s)");
       }
       if (ones != 0){
           System.out.println(ones + " one dollar bill(s)");
       }

       //This code breaks down change amount
       double quarters = Math.floor(change / 0.25);
       totalChange = (quarters * 0.25);
       double dimes = Math.floor((change - totalChange) / 0.1);
       totalChange = totalChange + (dimes * 0.1);
       double nickles = Math.floor((change - totalChange) / 0.05);
       totalChange = totalChange + (nickles * 0.05);
       double pennies = Math.floor((change - totalChange) / 0.01);
       totalChange = totalChange + (pennies * 0.01);
       System.out.println("You have received " + totalChange + " ¢ , in coins, broken down by:");
       if ( quarters != 0){
           System.out.println(quarters + " quarters");
       }
       if (dimes !=0){
           System.out.println(dimes + " dimes");
       }
       if (nickles != 0){
           System.out.println(nickles + " pennies");
       }
       if (pennies != 0){
           System.out.println(pennies + " pennies");
       }


    }

}
