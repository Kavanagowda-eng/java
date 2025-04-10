package com.xworkz.Inheritence.ToString1;
public class Desert{
private String sandColor;
private int temperature;
private boolean hasOasis;

public Desert(String sandColor, int temperature, boolean hasOasis) {
    this.sandColor = sandColor;
    this.temperature = temperature;
    this.hasOasis = hasOasis;
}

@Override
public String toString() {
    return "Desert: sandColor=" + sandColor + ", temperature=" + temperature + ", hasOasis=" + hasOasis;
}
    @Override
    public int hashCode() {
        return 93;}
}

