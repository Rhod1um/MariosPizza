import java.util.ArrayList;

public class OrderList {
  private ArrayList<Order> orders = new ArrayList<>();


  public void createAnOrder(ArrayList<Pizza> requestedPizzas) {
    Order order = new Order(requestedPizzas);
    orders.add(order);
  }

  public void removeAnOrder(String orderNumberInput) {
    for (int i = 0; i < orders.size(); i++) {
      String orderNumber = orders.get(i).getOrderNumber();
      if (orderNumberInput.equals(orderNumber)) {
        orders.remove(i);
        i = orders.size();
      }
    }
  }

  public void removeAnOrder(Order orderInput) {
    for (int i = 0; i < orders.size(); i++) {
      Order order = orders.get(i);
      if (orderInput == order) {
        orders.remove(i);
        i = orders.size();
      }
    }
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
}
