package com.xworkz.Inheritence.ToString1;

public class Notebook {
    private String pages;
    private int size;
    private boolean ruled;

    public Notebook(String pages, int size, boolean ruled) {
        this.pages = pages;
        this.size = size;
        this.ruled = ruled;
    }

    @Override
    public String toString() {
        return "Notebook: pages=" + pages + ", size=" + size + ", ruled=" + ruled;
    }
}
