class PichkariRun {

    public static void main(String... args) {
        Pichkari pichkari = new Pichkari("gun", "green");
        pichkari.shape = "tube";
        pichkari.color = "yellow";
        System.out.println("pichkarirun: " + pichkari.shape + ", " + pichkari.color);
    }
}