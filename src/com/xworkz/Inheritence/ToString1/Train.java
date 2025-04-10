package com.xworkz.Inheritence.ToString1;

public class Train {
    private String type;
    private int speed;
    private boolean coachCount;

    public Train(String type, int speed, boolean coachCount) {
        this.type = type;
        this.speed = speed;
        this.coachCount = coachCount;
    }

    @Override
    public String toString() {
        return "Train: type=" + type + ", speed=" + speed + ", coachCount=" + coachCount;
    }
    @Override
    public int hashCode() {
        return 89;}

}
