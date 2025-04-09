package com.xworkz.Inheritence.ToString1;

public class Bridge {
    private String length;
    private int material;
    private boolean type;

    public Bridge(String length, int material, boolean type) {
        this.length = length;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bridge: length=" + length + ", material=" + material + ", type=" + type;
    }
}
