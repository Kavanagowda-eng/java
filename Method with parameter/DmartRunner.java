public class DmartRunner {
    public static void main(String[] args) {
        System.out.println("Running Dmart in DmartRunner");
        Dmart Dmart = new Dmart(); 

        String category = "Groceries";
      	  Dmart.showProducts(category);

        String product = "Milk";
       Dmart.checkStock(product);

        String discountCategory = "Electronics";
        Dmart.applyDiscount(discountCategory);

        String purchaseProduct = "Rice";
        int purchaseQuantity = 5;
       Dmart.purchase(purchaseProduct, purchaseQuantity);

        String returnProduct = "Shoes";
        String reason = "Size mismatch";
       Dmart.returnProduct(returnProduct, reason);

        String orderProduct = "Laptop";
        int orderQuantity = 1;
        String deliveryAddress = "123 Street, City";
        Dmart.placeOrder(orderProduct, orderQuantity, deliveryAddress);

        String reviewProduct = "Smartphone";
        int rating = 4;
        String comments = "Great performance but average battery life.";
        Dmart.reviewProduct(reviewProduct, rating, comments);
    }
}