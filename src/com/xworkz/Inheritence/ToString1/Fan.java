package com.xworkz.Inheritence.ToString1;

public class Fan {
    private String blades;
    private int speed;
    private boolean brand;

    public Fan(String blades, int speed, boolean brand) {
        this.blades = blades;
        this.speed = speed;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Fan: blades=" + blades + ", speed=" + speed + ", brand=" + brand;
    }

    @Override
    public int hashCode() {
        return 93;
    }
@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Fan) {
            Fan fan1 = this;
            Fan fan2 = (Fan) obj;
            if (fan1.blades == fan2.blades) {
                return true;
            }
        }
        return false;
    }
}
