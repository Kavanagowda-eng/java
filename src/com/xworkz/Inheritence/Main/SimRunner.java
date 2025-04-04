package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Sim;

public class SimRunner {
        public static void main(String[] args) {
            Sim sim = new Sim();
            sim.buy();
            sim.sell();
            sim.use();
            sim.call();
            sim.connect();

            System.out.println("--------------------------------");


        }
    }

