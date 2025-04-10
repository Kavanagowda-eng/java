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
}
