package com.xworkz.Inheritence.ToString1;

public class Restaurant {
    private String tables;
    private int cuisine;
    private boolean hasDelivery;

    public Restaurant(String tables, int cuisine, boolean hasDelivery) {
        this.tables = tables;
        this.cuisine = cuisine;
        this.hasDelivery = hasDelivery;
    }

    @Override
    public String toString() {
        return "Restaurant: tables=" + tables + ", cuisine=" + cuisine + ", hasDelivery=" + hasDelivery;
    }
    @Override
    public int hashCode() {
        return 98;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Restaurant) {
            Restaurant restaurant1 = this;
            Restaurant restaurant2= (Restaurant) obj;
            if (restaurant1.tables==restaurant2.tables && restaurant1.cuisine== restaurant2.cuisine && restaurant1.hasDelivery==restaurant2.hasDelivery) {
                return true;
            }
        }
        return false;
}
}
