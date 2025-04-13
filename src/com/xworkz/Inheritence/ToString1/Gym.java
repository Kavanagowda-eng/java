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
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Gym){
           Gym gym1=this;
            Gym gym2=(Gym) obj;
            if(gym1.machines== gym2.machines){
                return true;
            }
        }
        return false;
}}
