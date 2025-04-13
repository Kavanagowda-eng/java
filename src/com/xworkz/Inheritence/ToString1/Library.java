package com.xworkz.Inheritence.ToString1;

public class Library {
    private String books;
    private int floors;
    private boolean hasDigitalSection;

    public Library(String books, int floors, boolean hasDigitalSection) {
        this.books = books;
        this.floors = floors;
        this.hasDigitalSection = hasDigitalSection;
    }

    @Override
    public String toString() {
        return "Library: books=" + books + ", floors=" + floors + ", hasDigitalSection=" + hasDigitalSection;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Library) {
            Library library1= this;
            Library library2= (Library) obj;
            if (library1.books== library2.books && library1.floors==library2.floors) {
                return true;
            }
        }
        return false;
    }
}
