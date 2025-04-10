package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Speaker;

public class SpeakerRun {
    public static void main(String[] args) {
        Speaker speaker = new Speaker("Sample", 456, true);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(speaker));
        System.out.println("-------------------------");
    }
}
