package com.theironyard.charlotte;

public class ATM {

    public static void main(String[] args) throws Exception {

        System.out.println("Greetings, Bank Member!");

        User u = new User();
        Transaction t = new Transaction();

        boolean canceled = false;

        u.chooseName();
        while (!canceled) {
            t.chooseEvent();
            switch (t.getSelection()){
                case 1:{
                    System.out.println("your current balance is $" + t.getBalance());
                    break;
                }
                case 2:{
                    t.withdrawFunds();
                    break;
                }
                case 3:{
                    System.out.println("Canceling");
                    System.out.println("Thank you, please come again");
                    canceled = true;
                    break;
                }
                default:{
                    System.out.println("This is an invalid selection.");
                    break;
                }
            }
        }
    }
}