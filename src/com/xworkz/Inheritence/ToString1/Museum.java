package com.xworkz.Inheritence.ToString1;

public class Museum {
    private String artifacts;
    private int floors;
    private boolean isInteractive;

    public Museum(String artifacts, int floors, boolean isInteractive) {
        this.artifacts = artifacts;
        this.floors = floors;
        this.isInteractive = isInteractive;
    }

    @Override
    public String toString() {
        return "Museum: artifacts=" + artifacts + ", floors=" + floors + ", isInteractive=" + isInteractive;
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
        if (obj instanceof Museum) {
            Museum museum1 = this;
            Museum museum2= (Museum) obj;
            if (museum1.artifacts== museum2.artifacts && museum1.floors== museum2.floors) {
                return true;
            }
        }
        return false;
}
}
