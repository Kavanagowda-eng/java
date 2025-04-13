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

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Beach) {
            Beach beach1 = this;
           Beach beach2= (Beach) obj;
            if (beach1.sandType ==beach2.sandType) {
                return true;
            }
        }
        return false;
    }

}
