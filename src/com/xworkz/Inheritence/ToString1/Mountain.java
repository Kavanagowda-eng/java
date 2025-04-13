package com.xworkz.Inheritence.ToString1;

public class Mountain {
    private String height;
    private int name;
    private boolean isClimbable;

    public Mountain(String height, int name, boolean isClimbable) {
        this.height = height;
        this.name = name;
        this.isClimbable = isClimbable;
    }

    @Override
    public String toString() {
        return "Mountain: height=" + height + ", name=" + name + ", isClimbable=" + isClimbable;
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
        if (obj instanceof Mountain) {
            Mountain mountain1 = this;
            Mountain mountain2= (Mountain) obj;
            if (mountain1.height== mountain2.height && mountain1.name==mountain2.name) {
                return true;
            }
        }
        return false;
    }
}
