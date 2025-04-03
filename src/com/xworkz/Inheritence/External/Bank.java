package com.xworkz.Inheritence.External;

public class Bank {
        public Bank() {
            System.out.println("Bank is the superclass");
        }

        public void openAccount() {
            System.out.println("Opening a bank account...");
        }

        public void depositMoney() {
            System.out.println("Depositing money...");
        }

        public void withdrawMoney() {
            System.out.println("Withdrawing money...");
        }

        public void provideLoan() {
            System.out.println("Providing a loan...");
        }

        public void closeAccount() {
            System.out.println("Closing a bank account...");
        }

}
