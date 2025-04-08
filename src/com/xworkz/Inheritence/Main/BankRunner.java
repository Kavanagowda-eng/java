package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.internal.DigitalBank;
import com.xworkz.Inheritence.External.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.provideLoan();
        bank.closeAccount();
        System.out.println("--------------------------------");

        Bank bank1 = new DigitalBank();
        bank1.openAccount();
        bank1.depositMoney();
        bank1.withdrawMoney();
        bank1.provideLoan();
        bank1.closeAccount();
        System.out.println("--------------------------------");

        Bank bank2 = new DigitalBank();
        bank2.openAccount();
        bank2.depositMoney();
        bank2.withdrawMoney();
        bank2.provideLoan();
        bank2.closeAccount();
        System.out.println("--------------------------------");

        Bank bank3 = new DigitalBank();
        bank3.openAccount();
        bank3.depositMoney();
        bank3.withdrawMoney();
        bank3.provideLoan();
        bank3.closeAccount();
        System.out.println("--------------------------------");


    }
        }
