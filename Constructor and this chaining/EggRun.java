class EggRun {
    public static void main(String... args) {
       
        Egg egg = new Egg("Chicken", "White");
        egg.type = "Duck";
        egg.color = "Brown";
        System.out.println("EggRun: " + egg.type + ", " + egg.color);
    }
}
