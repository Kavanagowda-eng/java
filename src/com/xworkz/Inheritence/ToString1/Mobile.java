package com.xworkz.Inheritence.ToString1;

public class Mobile {
    private String brand;
    private int price;
    private boolean isSmartphone;

    public Mobile(String brand, int price, boolean isSmartphone) {
        this.brand = brand;
        this.price = price;
        this.isSmartphone = isSmartphone;
    }

    @Override
    public String toString() {
        return "Mobile: brand=" + brand + ", price=" + price + ", isSmartphone=" + isSmartphone;
    }
}
