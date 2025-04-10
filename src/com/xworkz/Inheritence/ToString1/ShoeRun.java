package com.xworkz.Inheritence.ToString1;

public class ShoeRun {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Sample", 456, true);
        System.out.println(shoe);
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
