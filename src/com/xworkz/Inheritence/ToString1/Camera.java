package com.xworkz.Inheritence.ToString1;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean isDSLR;

    public Camera(String brand, int megapixels, boolean isDSLR) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.isDSLR = isDSLR;
    }

    @Override
    public String toString() {
        return "Camera: brand=" + brand + ", megapixels=" + megapixels + ", isDSLR=" + isDSLR;
    }
}
