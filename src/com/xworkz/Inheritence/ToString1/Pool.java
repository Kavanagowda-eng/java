package com.xworkz.Inheritence.ToString1;

public class Pool {
    private String length;
    private int depth;
    private boolean isIndoor;

    public Pool(String length, int depth, boolean isIndoor) {
        this.length = length;
        this.depth = depth;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return "Pool: length=" + length + ", depth=" + depth + ", isIndoor=" + isIndoor;
    }
}
