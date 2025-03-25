class ColorRun {

    public static void main(String... args) {
        Color color = new Color("Red", "Acrylic");
        color.shade = "Blue";
        color.brand = "Shalimar";
        System.out.println("colorrun: " + color.shade + ", " + color.brand);
    }
}