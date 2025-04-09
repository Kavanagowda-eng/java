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
}
