package com.xworkz.Inheritence.ToString1;
public class  Desert {
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
        return 93;
    }
@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Desert) {
            Desert desert1 = this;
            Desert desert2 = (Desert) obj;
            if (desert1.sandColor == desert2.sandColor) {
                return true;
            }
        }
        return false;
    }
}

