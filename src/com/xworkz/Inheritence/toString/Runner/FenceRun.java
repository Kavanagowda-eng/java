package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Fence;

public class FenceRun {
    public static void main(String[] args) {
        Fence fence = new Fence("Sample", 456, true);
        System.out.println(fence);
        System.out.println(fence.hashCode());
        System.out.println("Original:"+System.identityHashCode(fence));
        System.out.println("-------------------------");
    }
}
