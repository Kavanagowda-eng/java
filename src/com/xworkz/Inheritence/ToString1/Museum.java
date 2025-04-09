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
}
