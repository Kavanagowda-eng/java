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
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof River) {
            River river1 = this;
            River river2= (River) obj;
            if (river1.name==river2.name &&river1.length== river2.length && river1.flowsThrough==river2.flowsThrough) {
                return true;
            }
        }
        return false;
    }

}
