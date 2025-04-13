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
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Phone) {
            Phone phone1 = this;
            Phone phone2= (Phone) obj;
            if (phone1.model== phone2.model && phone1.storage== phone2.storage && phone1.is5G== phone2.is5G) {
                return true;
            }
        }
        return false;
}
}
