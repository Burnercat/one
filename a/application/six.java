package application;

import shopping.*;

public class six {
    public static void main(String[] args) {
        Cart cart = new Cart();

        try {
            Electronics laptop = new Electronics("E1001", "Laptop", 1200, "Dell", 2);
            Clothing tshirt = new Clothing("C2001", "T-Shirt", 25, "M", "Cotton");

            cart.addProduct(laptop);
            cart.addProduct(tshirt);

            cart.displayCart();
        } catch (ProductNotAvailableException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}