package com.xworkz.Inheritence.ToString1;

public class Mirror {
    private String shape;
    private int size;
    private boolean frameMaterial;

    public Mirror(String shape, int size, boolean frameMaterial) {
        this.shape = shape;
        this.size = size;
        this.frameMaterial = frameMaterial;
    }

    @Override
    public String toString() {
        return "Mirror: shape=" + shape + ", size=" + size + ", frameMaterial=" + frameMaterial;
    }
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Mirror) {
            Mirror mirror1 = this;
            Mirror  mirror2= (Mirror) obj;
            if (mirror1.shape== mirror2.shape && mirror1.size== mirror2.size) {
                return true;
            }
        }
        return false;
    }
}
