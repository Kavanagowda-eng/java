class Bitcoin {
    static void transfer() {
        System.out.println("Transferring Bitcoin.");
    }

    static void mine() {
        System.out.println("Mining new Bitcoins.");
        transfer(); // Calls a method within the same class
    }

    static void buyBitcoin() {
        System.out.println("Buying Bitcoin with currency.");
		mine();// Calls a method within the same class
        
    }

    static void sellBitcoin() {
        System.out.println("Selling Bitcoin for cash.");
        Wallet.addMoney(); // Calls a method from another class
		Currency.exchange(); // Calls a method from another class
    }
}