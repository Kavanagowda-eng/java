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
    @Override
    public int hashCode() {
        return 60;
}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bus){
            Camera camera1=this;
           Camera camera2=(Camera) obj;
            if(camera1.brand==camera2.brand){
                return true;
            }
        }
        return false;
    }
}

