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
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Mobile) {
            Mobile mobile1 = this;
            Mobile mobile2= (Mobile) obj;
            if (mobile1.brand== mobile2.brand && mobile1.price== mobile2.price) {
                return true;
            }
        }
        return false;
}
}
