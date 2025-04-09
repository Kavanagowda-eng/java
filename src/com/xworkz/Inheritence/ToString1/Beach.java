package com.xworkz.Inheritence.ToString1;

public class Beach {
    private String sandType;
    private int length;
    private boolean hasLifeguards;

    public Beach(String sandType, int length, boolean hasLifeguards) {
        this.sandType = sandType;
        this.length = length;
        this.hasLifeguards = hasLifeguards;
    }

    @Override
    public String toString() {
        return "Beach: sandType=" + sandType + ", length=" + length + ", hasLifeguards=" + hasLifeguards;
    }
}
