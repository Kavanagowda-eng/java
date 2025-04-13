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

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Bridge) {
            Bridge bridge1 = this;
            Bridge bridge2=(Bridge)obj;
            if (bridge1.length==bridge2.length){
                return true;
            }
        }
        return false;
    }

}
