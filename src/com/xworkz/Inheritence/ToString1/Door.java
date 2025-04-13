package com.xworkz.Inheritence.ToString1;

public class Door {
    private String material;
    private int height;
    private boolean isSliding;

    public Door(String material, int height, boolean isSliding) {
        this.material = material;
        this.height = height;
        this.isSliding = isSliding;
    }

    @Override
    public String toString() {
        return "Door: material=" + material + ", height=" + height + ", isSliding=" + isSliding;
    }

    @Override
    public int hashCode() {
        return 93;
    }
@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Door) {
            Door door1 = this;
            Door door2 = (Door) obj;
            if (door1.material == door2.material) {
                return true;
            }
        }
        return false;
    }
}
