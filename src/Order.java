import java.util.ArrayList;

public class Order {
  private static int numberOfOrders; // antallet af ordre er en attribut der er delt af alle instancer/objekter af en Order
  private String orderNumber; // hver instance/objekt af en Order har et nummer/ID der er gemt som en String/tekst
  private ArrayList<Pizza> pizzaOrder; // hver order har en ArrayListe med pizzaer der skabes/new ArrayList<> et andet sted


  Order(ArrayList<Pizza> pizzaOrder) { // når en Order bliver instanceret skal den have en ArrayListe<Pizza> med pizzaer
    this.pizzaOrder = pizzaOrder; // argumentet bliver sat til at være ordren af pizzaer
    numberOfOrders++; // nummeret af ordre går op med 1
    orderNumber = String.valueOf(numberOfOrders); // nummeret/ID'et for ordren sættes til at være lig med numberOfOrders typecastet til en String
  }

  @Override
  public String toString() { // printes en instance/objekt af en Order, vil dette displaye på skærmen
    String orderedPizzas = ""; // denne String variabel kommer til at have all ordered pizzaers: nummer, navn og beskrivelse efterfulgt af en ny linje
    for (int i = 0; i < pizzaOrder.size(); i++) {
      Pizza pizza = pizzaOrder.get(i);
      orderedPizzas += pizza.getPizzaNumber() + ". " + pizza.getName() + ": " + pizza.getDescription() + '\n';
    }
    return "Order nr. " + orderNumber + '\n' +
        orderedPizzas;
  }

  // Getters
  public String getOrderNumber() {
    return orderNumber;
  }
}
