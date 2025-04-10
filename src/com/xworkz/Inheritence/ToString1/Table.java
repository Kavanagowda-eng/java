package com.xworkz.Inheritence.ToString1;

public class Table {
    private String shape;
    private int length;
    private boolean woodType;

    public Table(String shape, int length, boolean woodType) {
        this.shape = shape;
        this.length = length;
        this.woodType = woodType;
    }

    @Override
    public String toString() {
        return "Table: shape=" + shape + ", length=" + length + ", woodType=" + woodType;
    }
    @Override
    public int hashCode() {
        return 89;}
}
