package com.xworkz.Inheritence.ToString1;

public class Scanner {
    private String resolution;
    private int brand;
    private boolean speed;

    public Scanner(String resolution, int brand, boolean speed) {
        this.resolution = resolution;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Scanner: resolution=" + resolution + ", brand=" + brand + ", speed=" + speed;
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
        if (obj instanceof Scanner) {
            Scanner scanner1 = this;
            Scanner scanner2= (Scanner) obj;
            if (scanner1.resolution==scanner2.resolution && scanner1.brand==scanner2.brand && scanner1.speed==scanner2.speed) {
                return true;
            }
        }
        return false;
}
}
