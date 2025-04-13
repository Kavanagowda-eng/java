package com.xworkz.Inheritence.ToString1;

public class Robot {
    private String name;
    private int purpose;
    private boolean batteryLife;

    public Robot(String name, int purpose, boolean batteryLife) {
        this.name = name;
        this.purpose = purpose;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Robot: name=" + name + ", purpose=" + purpose + ", batteryLife=" + batteryLife;
    }
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof java.awt.Robot) {
            Robot robot1 = this;
            Robot robot2= (Robot) obj;
            if (robot1.name==robot2.name && robot1.purpose==robot2.purpose && robot1.batteryLife==robot2.batteryLife) {
                return true;
            }
        }
        return false;
    }

}

