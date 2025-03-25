public class Dmart {

    public void showProducts(String category) {
        System.out.println("Showing products in category: " + category);
    }

    public void checkStock(String product) {
        System.out.println("Checking stock for: " + product);
    }

    public void applyDiscount(String category) {
        System.out.println("Applying discount on " + category + " products.");
    }

    public void purchase(String product, int quantity) {
        System.out.println("Purchasing " + quantity + " units of " + product + ".");
    }

    public void returnProduct(String product, String reason) {
        System.out.println("Returning " + product + " due to: " + reason);
    }

    public void placeOrder(String product, int quantity, String deliveryAddress) {
        System.out.println("Order placed for " + quantity + " units of " + product + " to " + deliveryAddress);
    }

    public void reviewProduct(String product, int rating, String comments) {
        System.out.println("Review for " + product + ": " + rating + "/5 - " + comments);
    }
}