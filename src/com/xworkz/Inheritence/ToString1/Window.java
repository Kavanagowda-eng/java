package com.xworkz.Inheritence.ToString1;

public class Window {
    private String type;
    private int width;
    private boolean glassType;

    public Window(String type, int width, boolean glassType) {
        this.type = type;
        this.width = width;
        this.glassType = glassType;
    }

    @Override
    public String toString() {
        return "Window: type=" + type + ", width=" + width + ", glassType=" + glassType;
    }
    @Override
    public int hashCode() {
        return 45;}
}

