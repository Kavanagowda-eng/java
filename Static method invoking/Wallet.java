class Wallet {
    static void addMoney() {
        System.out.println("Adding money to the wallet.");
    }

    static void checkBalance() {
        System.out.println("Checking wallet balance.");
        addMoney(); class Wallet {
    static void addMoney() {
        System.out.println("Adding money to the wallet.");
    }
    static void checkBalance() {
        System.out.println("Checking wallet balance.");
        addMoney(); // Calls a method within the same class
    }
    static void buyItem() {
        System.out.println("Buying an item using the wallet.");
    }
    static void sendMoney() {
        System.out.println("Sending money from the wallet.");
        Currency.exchange() // Calls a method from another class
		Bitcoin.transfer(); // Calls a method from another class
    }
    }

