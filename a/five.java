class Vehicle{
    protected String make,model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
    
    public void displayDetails(Boolean detailed){
        displayDetails();
        if(detailed){
            System.out.println("No Additional Details");
        }
    }

    public static void showType(){
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle{
    private int noOfDoors;

    public Car(String make, String model, int year, int nuOfDoors){
        super(make, model, year);
        this.noOfDoors = nuOfDoors;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("No of Doors: " + noOfDoors);
    }

    public void displayDetails(String format){
        System.out.println(format+ " " + year + " " + make + " " + model + " " + noOfDoors);
    }

    public static void showType(){
        System.out.println("Car");
    }
}

class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String make, String model, int year, double loadCapacity){
    super(make, model, year);
    this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    public void displayDetails(String format){
        System.out.println(format + " " + year + " " + make + " " + model + " " + loadCapacity);
    }

    public static void showType(){    
        System.out.println("Truck");
    }
}

public class five{
    public static void main(String args[]){
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota", "Supra", 2022, 4);
        vehicles[1] = new Truck("Ford", "F-150", 2021, 3.5);
        vehicles[2] = new Car("Mitsubishi", "Lancer", 2020, 4);
        vehicles[3] = new Truck("Chevrolet", "Silverado", 2019, 5.5);

        for(Vehicle vehicle : vehicles){
            vehicle.displayDetails();
            System.out.println();
        }

        Vehicle.showType();
        Car.showType();
        Truck.showType();
    }
}