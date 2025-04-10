package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Keychain;

public class KeychainRun {
    public static void main(String[] args) {
        Keychain keychain = new Keychain("Sample", 456, true);
        System.out.println(keychain);
        System.out.println(keychain.hashCode());
        System.out.println("Original:"+System.identityHashCode(keychain));
        System.out.println("-------------------------");
    }
}
