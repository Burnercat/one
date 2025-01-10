 package shopping;
 import java.util.ArrayList;

 // Define Product interface
 interface Product {
 double getPrice();
 String getDetails();
 void printDetails();
 }
 // Base class Item implementing Product
 abstract class Item implements Product {
 protected String productId, productName;
 protected double price;
 public Item(String productId, String productName, double price) {
 this.productId = productId;
 this.productName = productName;
 this.price = price;
 }
 @Override
 public double getPrice() {
 return price;
 }
 @Override
 public void printDetails() {
 System.out.println(getDetails());
 }
 }
 // Subclass Electronics
 class Electronics extends Item {
 private String brand;
 private int warranty;
 public Electronics(String productId, String productName, double price, String brand,
 int warranty) {
 super(productId, productName, price);
 this.brand = brand;
 this.warranty = warranty;
 }
 @Override
 public String getDetails() {
 return "Electronics- " + productName + " (Brand: " + brand + ", Warranty: " +
 warranty + " years, Price: $" + price + ")";
 }
 }
 // Subclass Clothing
 class Clothing extends Item {
 private String size, material;
 public Clothing(String productId, String productName, double price, String size,
 String material) {
 super(productId, productName, price);
 this.size = size;
 this.material = material;
 }
 @Override
 public String getDetails() {
 return "Clothing- " + productName + " (Size: " + size + ", Material: " + material +
 ", Price: $" + price + ")";
 }
 }
 // Exception classes
 class ProductNotAvailableException extends Exception {
 public ProductNotAvailableException(String message) {
 super(message);
 }
 }
 class InvalidProductException extends Exception {
 public InvalidProductException(String message) {
 super(message);
 }
 }
 // Shopping Cart
 class Cart {
 private ArrayList<Product> cartItems;
 public Cart() {
 cartItems = new ArrayList<>();
 }
 public void addProduct(Product product) throws ProductNotAvailableException,
 InvalidProductException {
 if (product == null) {
 throw new InvalidProductException("Invalid product! Cannot add to cart.");
 }
 cartItems.add(product);
 }
 public double calculateTotal() {
 return cartItems.stream().mapToDouble(Product::getPrice).sum();
 }
 public void displayCart() {
 if (cartItems.isEmpty()) {
 System.out.println("Cart is empty.");
 return;
 }
 for (Product product : cartItems) {
     product.printDetails();
 }
 System.out.println("Total Price: $" + calculateTotal());
 }
 }


