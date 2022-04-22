public class Pizza {
    private String pizzaNumber;
    private String name;
    private String description;
    private double price;
    private static int numberOfPizzasOnMenu;

    Pizza(String name, String description, double price) {
        numberOfPizzasOnMenu++;
        pizzaNumber = String.valueOf(numberOfPizzasOnMenu); //pizzanummer int typecastes til String
        this.name = name;
        this.description = description;
        this.price = price;
    }


    @Override
    public String toString() {
        String numberNameDescription = pizzaNumber + ". " + name + ": " + description;
        return String.format("%-130s%.0f,-", numberNameDescription, price);
        //return String.format("%s\t%s: %-70s%30f", pizzaNumber, name, description, price);
        //return pizzaNumber + '.' + '\t' + String.format("%s", name) + ": " + String.format("%-90s", description) + String.format("%f", price) + ".-";
        // vi skal have noget replace all her
    }

    // Getters
    public String getPizzaNumber() {
        return pizzaNumber;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
}
