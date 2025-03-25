public class AnkletRun {
    public static void main(String[] args) {
      
        Anklet a1 = new Anklet("Silver", "Red", 7.5);
        Anklet a2 = new Anklet("Gold", "Blue", 6.8);
        Anklet a3 = new Anklet("Platinum", "Green", 8.0);
        Anklet a4 = new Anklet("Copper", "Black", 7.0);
        Anklet a5 = new Anklet("Diamond", "White", 6.5);


        
        System.out.println(a1.material + ", " + a1.color + ", " + a1.size);
        System.out.println(a2.material + ", " + a2.color + ", " + a2.size);
        System.out.println(a3.material + ", " + a3.color + ", " + a3.size);
        System.out.println(a4.material + ", " + a4.color + ", " + a4.size);
        System.out.println(a5.material + ", " + a5.color + ", " + a5.size);
    }
}