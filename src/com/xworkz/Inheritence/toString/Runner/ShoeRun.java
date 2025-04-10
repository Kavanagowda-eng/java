package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Shoe;

public class ShoeRun {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Sample", 456, true);
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println("Original:"+System.identityHashCode(shoe));
        System.out.println("-------------------------");
    }
}
