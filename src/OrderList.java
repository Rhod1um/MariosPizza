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
    if (orders.size() > 0) {
      Order anOrder;
      String allOrders = "";
      for (int i = 0; i < orders.size(); i++) {
        String BACKGROUND;
        String END_BACKGROUND = "\u001B[0m";
        if (i % 2 == 0) {
          BACKGROUND = "\u001B[40m"; // Sort baggrundsfarve ved lige index
        } else {
          BACKGROUND = "\u001B[42m"; // Grøn baggrundsfarve ved ulige index
        }
        anOrder = getAnOrder(i);
        allOrders += BACKGROUND + anOrder + END_BACKGROUND;
        if (i != orders.size() - 1) {
          allOrders += "\n\n";
        }
      }
      return "Ordre Listen:\n\n" +
          allOrders;
    } else {
      return "Der er ingen ordre på listen i dette øjeblik.";
    }

  }

  // Getters
  public Order getAnOrder(int i) {
    return orders.get(i);
  }

  public ArrayList<Order> getOrders() {
    return orders;
  }
}
