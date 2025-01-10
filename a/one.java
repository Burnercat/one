class Flight{
    protected String flightNumber;
    protected String airline;
    protected double basePrice;

    public Flight(){
        this.flightNumber = "";
        this.airline = "";
        this.basePrice = 0;
    }

    public Flight(String flightNumber, String airline, double basePrice){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.basePrice = basePrice;
    }

    public void displayDetails(){
        System.out.println("Flight Number: " + this.flightNumber);
        System.out.println("Airline: " + this.airline);
        System.out.println("Base Price: " + this.basePrice);
    }

}

class DomesticFlight extends Flight{
    private double domesticTax;

    public DomesticFlight(String flightNumber, String airline, double basePrice,double domesticTaxRate){
        super(flightNumber,airline,basePrice);
        this.domesticTax = domesticTaxRate;
    }

    public double calculatePrice(){
        return basePrice+(basePrice*domesticTax/100);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Domestic Tax:"+ domesticTax+ "%");
        System.out.println("Total Price:"+ calculatePrice());
    }
}

class InternationalFlight extends Flight{
    private double internationalTax;
    private double customsFee;

    public InternationalFlight(String flightNumber, String airline, double basePrice, double internationalTax, double customsFee){
        super(flightNumber,airline,basePrice);
        this.internationalTax = internationalTax;
        this.customsFee = customsFee;
    }

    public double calculatePrice(){
        return basePrice+(basePrice*internationalTax/100)+customsFee;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("International Tax:"+ internationalTax+ "%");
        System.out.println("Customs Fee:"+ customsFee);
        System.out.println("Total Price:"+ calculatePrice());
    }
}

public class one{
    public static void main(String args[]) {
        Flight dom = new DomesticFlight("HYD123", "Rapid", 10000, 10);
        System.out.println("Domestic Flight");
        dom.displayDetails();

        Flight intl = new InternationalFlight("NEARK", "Mach", 10000, 10, 100);
        System.out.println("International Flight");
        intl.displayDetails();
    }
}