public class Beer {

    public void drink(int quantity) {
        System.out.println("Drinking " + quantity + " ml of beer.");
    }

    public void store(int temperature) {
        System.out.println("Storing beer at " + temperature + "°C.");
    }

    public void chooseBrand(String brand) {
        System.out.println("Choosing " + brand + " beer.");
    }

    public void serve(String glassType, int temperature) {
        System.out.println("Serving beer in a " + glassType + " at " + temperature + "°C.");
    }

    public void brew(int duration, double alcoholContent) {
        System.out.println("Brewing beer for " + duration + " days with " + alcoholContent + "% alcohol.");
    }

    public void packageBeer(String packagingType, int volume, String label) {
        System.out.println("Packaging " + volume + "ml beer in " + packagingType + " with label: " + label + ".");
    }

    public void sell(String retailer, double price, int stock) {
        System.out.println("Selling to " + retailer + " at $" + price + " per unit, stock: " + stock + ".");
    }
}