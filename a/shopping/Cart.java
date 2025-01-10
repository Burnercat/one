package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) throws ProductNotAvailableException, InvalidProductException {
        if (product == null) {
            throw new InvalidProductException("Invalid product!");
        }
        if (!product.getClass().equals(Electronics.class) && !product.getClass().equals(Clothing.class)) {
            throw new InvalidProductException("Invalid product type!");
        }
        cartItems.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        for (Product product : cartItems) {
            product.printDetails();
        }
        System.out.println("Total Price: $" + calculateTotal());
    }
}