package com.xworkz.Inheritence.ToString1;

public class Phone {
    private String model;
    private int storage;
    private boolean is5G;

    public Phone(String model, int storage, boolean is5G) {
        this.model = model;
        this.storage = storage;
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "Phone: model=" + model + ", storage=" + storage + ", is5G=" + is5G;
    }
}
