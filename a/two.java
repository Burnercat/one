import java.util.ArrayList;
 
 interface RentalService {
     boolean checkAvailability();
     void rent();
     void returnCar();
     double calculateRentalCost(int days, double distance);
 }
 
 class Car implements RentalService {
     private String make, model;
     private int year;
     private double dailyRate;
     private boolean isAvailable;
 
     public Car(String make, String model, int year, double dailyRate) {
         this.make = make;
         this.model = model;
         this.year = year;
         this.dailyRate = dailyRate;
         this.isAvailable = true;
     }
 
     @Override
     public boolean checkAvailability() {
         return isAvailable;
     }
 
     @Override
     public void rent() {
         if (isAvailable) {
             isAvailable = false;
         }
     }
 
     @Override
     public void returnCar() {
         isAvailable = true;
     }
 
     @Override
     public double calculateRentalCost(int days, double distance) {
         return (days * dailyRate) + (0.2 * distance);
     }
 
     public void displayDetails() {
         System.out.println(year + " " + make + " " + model + "- Daily Rate: $" + dailyRate + "- Available: " + isAvailable);
     }
 
     public Car compareRates(Car other) {
         return this.dailyRate < other.dailyRate ? this : other;
     }
 
     public String getMake() {
         return make;
     }
 
     public String getModel() {
         return model;
     }
 }
 
 class CarRentalService {
     private ArrayList<Car> cars;
 
     public CarRentalService() {
         this.cars = new ArrayList<>();
     }
 
     public void addCar(Car car) {
         cars.add(car);
     }
 
     public Car findCar(String make, String model) {
         for (Car car : cars) {
             if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                 return car;
             }
         }
         return null;
     }
 
     public void displayAvailableCars() {
         for (Car car : cars) {
             if (car.checkAvailability()) {
                 car.displayDetails();
             }
         }
     }
 }
 
 public class two {
     public static void main(String[] args) {
         CarRentalService rentalService = new CarRentalService();
 
         // Adding sample cars
         Car car1 = new Car("Toyota", "Camry", 2022, 50);
         Car car2 = new Car("Honda", "Civic", 2021, 45);
         Car car3 = new Car("Ford", "Focus", 2023, 55);
         rentalService.addCar(car1);
         rentalService.addCar(car2);
         rentalService.addCar(car3);
 
         // Displaying available cars
         rentalService.displayAvailableCars();
     }
 }