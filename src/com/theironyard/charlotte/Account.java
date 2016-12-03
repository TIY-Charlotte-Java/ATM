package com.theironyard.charlotte;


import java.util.Scanner;


/**
 * Created by emileenmarianayagam on 12/1/16.
 */
public class Account {
    int answer;


    public void option() throws Exception {
        int choice;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome -- what would you like to do -- 1. Check my balance -- 2. Withdrawl Fuds -- 3 Cancel");
            choice = input.nextInt();

            if (choice == 1) {
                Transaction amount = new Transaction();
                amount.printBalance();
            } else if (choice == 2) {
                Transaction moneyTaken = new Transaction();
                moneyTaken.amountWithdrawn();
            } else {
                System.out.println("Thank you and Please come again");
            }
            if (choice != 3) {
                System.out.println("would you like to complete more transactions-- 1 Yes -- 2 No");
                answer = input.nextInt();
            }
        } while (answer == 1);
    }
}


