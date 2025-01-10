class MenuItem{
    final String name;
    double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public final void displayDetails(){
        System.out.println("Item " + name+ "Price " + price);
    }
}

class FoodItem extends MenuItem{
    boolean isVeg;

    public FoodItem(String name, double price, boolean isVeg){
        super(name,price);
        this.isVeg = isVeg;
    }


    public void displayFoodDetails(){
        super.displayDetails();
        System.out.println("Is Veg? " +(isVeg ? "Yes" : "No"));
    }
}

class BeverageItem extends MenuItem{
    boolean isAlcoholic;

    public BeverageItem(String name, double price, boolean isAlcoholic){
        super(name,price);
        this.isAlcoholic = isAlcoholic;
    }

    public void displayBeverageDetails(){
        super.displayDetails();
        System.out.println("Is Alcoholic? " +(isAlcoholic ? "Yes" : "No"));
    }
}

public class four{
    public static void main(String args[]){
        MenuItem[] menu = new MenuItem[5];

        menu[0] = new BeverageItem("Water", 10, false);
        menu[1] = new FoodItem("Pulao Rice",70, true);
        menu[2] = new FoodItem("Chicken Masala", 100, false);
        menu[3] = new BeverageItem("Coke", 20, false);
        menu[4] = new BeverageItem("Beer", 250, true);

        for(MenuItem item : menu){
            item.displayDetails();
            if(item instanceof FoodItem){
                ((FoodItem)item).displayFoodDetails();
            }else if(item instanceof BeverageItem){
                ((BeverageItem)item).displayBeverageDetails();
            }

            System.out.println();
        }
    }
}