import java.util.ArrayList;

public class OrderList {
  private ArrayList<Order> orders = new ArrayList<>();


  public void createAnOrder(ArrayList<Pizza> requestedPizzas) {
    Order order = new Order(requestedPizzas);
    orders.add(order);
  }



  public void removeAnOrder(Order orderInput) {
    orders.remove(orderInput);
  }

  @Override
  public String toString() {
    Order anOrder;
    String allOrders = "";
    for (int i = 0; i < orders.size(); i++) {
      anOrder = getAnOrder(i);
      allOrders += anOrder + "\n";
    }
    return "Ordre Listen:\n\n" +
        allOrders;
  }

  // Getters
  public Order getAnOrder(int i) {
    return orders.get(i);
  }

  public ArrayList<Order> getOrders() {
    return orders;
  }
}
