package com.xworkz.Inheritence.ToString1;

public class Cafe {
    private String drinks;
    private int seats;
    private boolean isOpenLate;

    public Cafe(String drinks, int seats, boolean isOpenLate) {
        this.drinks = drinks;
        this.seats = seats;
        this.isOpenLate = isOpenLate;
    }

    @Override
    public String toString() {
        return "Cafe: drinks=" + drinks + ", seats=" + seats + ", isOpenLate=" + isOpenLate;
    }
    @Override
    public int hashCode() {
        return 45;
}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cafe){
            Cafe cafe1=this;
            Cafe cafe2=(Cafe) obj;
            if(cafe1.drinks==cafe2.drinks){
                return true;
            }
        }
        return false;
    }
}
