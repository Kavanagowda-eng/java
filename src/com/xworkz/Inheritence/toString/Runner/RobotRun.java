package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Robot;

public class RobotRun {
    public static void main(String[] args) {
        Robot robot = new Robot("Sample", 456, true);
        System.out.println(robot);
        System.out.println(robot.hashCode());
        System.out.println("Original:"+System.identityHashCode(robot));
        System.out.println("-------------------------");
    }
}
