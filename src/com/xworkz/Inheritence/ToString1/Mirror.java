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
}
