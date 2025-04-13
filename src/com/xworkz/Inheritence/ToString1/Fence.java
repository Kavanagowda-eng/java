package com.xworkz.Inheritence.ToString1;

public class Fence {
    private String material;
    private int height;
    private boolean color;

    public Fence(String material, int height, boolean color) {
        this.material = material;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fence: material=" + material + ", height=" + height + ", color=" + color;
    }

    @Override
    public int hashCode() {
        return 99;
    }
@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Fence) {
            Fence fence1 = this;
            Fence fence2 = (Fence) obj;
            if (fence1.material == fence2.material) {
                return true;
            }
        }
        return false;
    }
}