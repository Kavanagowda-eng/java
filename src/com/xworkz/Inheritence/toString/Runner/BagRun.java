package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Bag;

public class BagRun {
    public static void main(String[] args) {
        Bag bag = new Bag("Blue", 20, true);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println("Original:"+System.identityHashCode(bag));
        System.out.println("-------------------------");
    }
}
