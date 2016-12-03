package com.theironyard.charlotte;


import com.sun.tools.javac.comp.Check;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Person user = new Person();
        user.createPerson();

        Account createAccount = new Account();
        createAccount.option();
    }
}
