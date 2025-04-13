package com.xworkz.Inheritence.ToString1;

public class Book {
    private String brand;
    private int type;
    private boolean gearCount;

    public Book(String brand, int type, boolean gearCount) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Bicycle: brand=" + brand + ", type=" + type + ", gearCount=" + gearCount;
    }

    @Override
    public int hashCode() {
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Book ) {
            Book book1 = this;
            Book book2=(Book)obj;
            if (book1.brand==book2.brand) {
                return true;
            }
        }
        return false;
    }

}

