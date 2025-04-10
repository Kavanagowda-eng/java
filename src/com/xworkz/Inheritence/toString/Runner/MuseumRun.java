package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Mountain;
import com.xworkz.Inheritence.ToString1.Museum;

public class MuseumRun {
    public static void main(String[] args) {
        Museum museum = new Museum("Sample", 456, true);
        System.out.println(museum);
        System.out.println(museum.hashCode());
        System.out.println("Original:"+System.identityHashCode(museum));
        System.out.println("-------------------------");
    }

}



