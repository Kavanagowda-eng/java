class Currency {
    static void exchange() {
        System.out.println("Exchanging currency.");
    }

    static void convert() {
        System.out.println("Converting currency to another form.");
        exchange();// Calls a method within the same class
    }

    static void deposit() {
        System.out.println("Depositing currency into the bank.");
        convert();// Calls a method within the same class
    }

    static void withdraw() {
        System.out.println("Withdrawing currency from the bank.");
        Bitcoin.transfer(); // Calls a method from another class
		Wallet.addMoney(); // Calls a method from another class
    }
}