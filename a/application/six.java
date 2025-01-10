 package application;
 import shopping.*;
 public class six {
 public static void main(String[] args) {
 try {
 Cart cart = new Cart();
 Product laptop = new Electronics("E1001", "Laptop", 1200, "Dell", 2);
 Product tshirt = new Clothing("C2001", "T-Shirt", 25, "M", "Cotton");
 cart.addProduct(laptop);
 cart.addProduct(tshirt);
 System.out.println("\nShopping Cart:");
 cart.displayCart();
 } catch (ProductNotAvailableException | InvalidProductException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
 }