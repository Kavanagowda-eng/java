package com.xworkz.Inheritence.ToString1;

public class River {
    private String name;
    private int length;
    private boolean flowsThrough;

    public River(String name, int length, boolean flowsThrough) {
        this.name = name;
        this.length = length;
        this.flowsThrough = flowsThrough;
    }

    @Override
    public String toString() {
        return "River: name=" + name + ", length=" + length + ", flowsThrough=" + flowsThrough;
    }
}
