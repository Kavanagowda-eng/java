package com.xworkz.Inheritence.ToString1;

public class Gym {
    private String machines;
    private int trainers;
    private boolean is24Hours;

    public Gym(String machines, int trainers, boolean is24Hours) {
        this.machines = machines;
        this.trainers = trainers;
        this.is24Hours = is24Hours;
    }

    @Override
    public String toString() {
        return "Gym: machines=" + machines + ", trainers=" + trainers + ", is24Hours=" + is24Hours;
    }
}
