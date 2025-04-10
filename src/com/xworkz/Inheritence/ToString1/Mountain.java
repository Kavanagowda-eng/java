package com.xworkz.Inheritence.ToString1;

public class Mountain {
    private String height;
    private int name;
    private boolean isClimbable;

    public Mountain(String height, int name, boolean isClimbable) {
        this.height = height;
        this.name = name;
        this.isClimbable = isClimbable;
    }

    @Override
    public String toString() {
        return "Mountain: height=" + height + ", name=" + name + ", isClimbable=" + isClimbable;
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
