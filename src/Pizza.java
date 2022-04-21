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
        return pizzaNumber + '.' + '\t' + name + ": " + description + "........" + price + ".-";
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
