//Abstract Factory
public class BeverageFactory {
    public static Beverage getInstance(String beverageType){
        if (beverageType.equalsIgnoreCase("Coffee")) return new Coffee();
        if (beverageType.equalsIgnoreCase("Tea")) return new Tea();
        if (beverageType.equalsIgnoreCase("Latte")) return new Latte();
        return null;
    }
}
