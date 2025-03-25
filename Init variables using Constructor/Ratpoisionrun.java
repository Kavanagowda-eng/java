public class Ratpoisonrun {
    public static void main(String[] args) {
       
        RatPoison r1 = new RatPoison("XYZ", "Red", "solid");
        RatPoison r2 = new RatPoison("ABC", "black", "Powder");
        RatPoison r3 = new RatPoison("DDD", "blue", "Liquid");
        RatPoison r4 = new RatPoison("WWW", "green", "Tablet");
        RatPoison r5 = new RatPoison("ZZZ", "red", "Spray");

        System.out.println(r1.brand + ", " + r1.color + ", " + r1.form);
        System.out.println(r2.brand + ", " + r2.color + ", " + r2.form);
        System.out.println(r3.brand + ", " + r3.color + ", " + r3.form);
        System.out.println(r4.brand + ", " + r4.color + ", " + r4.form);
        System.out.println(r5.brand + ", " + r5.color + ", " + r5.form);
    }
}