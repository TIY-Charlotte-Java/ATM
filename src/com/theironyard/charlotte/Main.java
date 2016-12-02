package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        ATM t = new ATM();

        p.provideName();
        t.getBalance();
        t.selectTask();



    }
}
