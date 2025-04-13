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
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Pool) {
            Pool pool1 = this;
            Pool pool2= (Pool) obj;
            if (pool1.length== pool2.length&& pool1.length== pool2.length && pool1.isIndoor== pool2.isIndoor) {
                return true;
            }
        }
        return false;
    }

}

