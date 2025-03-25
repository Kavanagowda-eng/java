class Bracelet {
    static void wear() {
        System.out.println("Wearing a bracelet.");
    }

    static void remove() {
        System.out.println("Removing the bracelet.");
        wear(); // Calls a method within the same class
    }

    static void polish() {
        System.out.println("Polishing the bracelet.");
        remove();
    }
    static void gift() {
        System.out.println("Gifting a bracelet.");
         Gold.showValue();// Calls a method from another class
         Wallet.addMoney();// Calls a method from another class
	}
}