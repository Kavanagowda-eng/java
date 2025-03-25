class NailPolishRun {
    public static void main(String... args) {
        NailPolish nailPolish = new NailPolish("Red", "Maybelline");
        nailPolish.shade = "Pink";
        nailPolish.brand = "Revlon";
        System.out.println("nailPolishRun: " + nailPolish.shade + ", " + nailPolish.brand);
    }
}