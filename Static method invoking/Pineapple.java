class Pineapple {
    static void eat() {
        System.out.println("Eating pineapple.");
    }

    static void peel() {
        System.out.println("Peeling pineapple.");
        eat(); // Calls a method within the same class
    }

    static void juice() {
        System.out.println("Making pineapple juice.");
       peel();// Calls a method within the same class
    }

    static void buy() {
        System.out.println("Buying a pineapple.");
		Gold.showValue(); 
       Wire.transmitSignal();  
    }
}