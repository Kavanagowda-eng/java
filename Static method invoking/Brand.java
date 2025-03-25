class Brand {
    static void displayBrand() {
        System.out.println("Displaying brand details.");
    }

    static void promoteBrand() {
        System.out.println("Promoting the brand.");
        displayBrand(); // Calls a method within the same class
    }

    static void collaborate() {
        System.out.println("Collaborating with another brand.");
        promoteBrand();// Calls a method within the same class
    }

    static void sponsor() {
        System.out.println("Sponsoring an event.");
        Perfume.spray(); // Calls a method from another class
		Wallet.addMoney();// Calls a method from another class
    
}
}