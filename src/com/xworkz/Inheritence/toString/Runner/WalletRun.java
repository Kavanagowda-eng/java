package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Wallet;

public class WalletRun {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("Sample", 456, true);
        System.out.println(wallet);
        System.out.println(wallet.hashCode());
        System.out.println("Original:"+System.identityHashCode(wallet));
        System.out.println("-------------------------");
    }
}
