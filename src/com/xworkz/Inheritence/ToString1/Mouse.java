package com.xworkz.Inheritence.ToString1;

public class Mouse {
    private String brand;
    private int isWireless;
    private boolean dpi;

    public Mouse(String brand, int isWireless, boolean dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Mouse: brand=" + brand + ", isWireless=" + isWireless + ", dpi=" + dpi;
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
        if (obj instanceof Mouse) {
            Mouse mouse1 = this;
            Mouse mouse2= (Mouse) obj;
            if (mouse1.brand== mouse2.brand && mouse1.isWireless== mouse2.isWireless) {
                return true;
            }
        }
        return false;
    }
}
