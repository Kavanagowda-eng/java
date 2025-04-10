package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.TShirt;

public class TShirtRun {
    public static void main(String[] args) {
        TShirt tshirt = new TShirt("Sample", 456, true);
        System.out.println(tshirt);
        System.out.println(tshirt.hashCode());
        System.out.println("Original:"+System.identityHashCode(tshirt));
        System.out.println("-------------------------");
    }
}
