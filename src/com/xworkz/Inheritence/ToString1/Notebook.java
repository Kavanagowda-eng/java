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
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Notebook) {
           Notebook notebook1 = this;
           Notebook notebook2= (Notebook) obj;
            if (notebook1.pages==notebook2.pages && notebook2.size== notebook2.size) {
                return true;
            }
        }
        return false;
}
}
