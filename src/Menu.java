import java.util.ArrayList;
import java.util.List;

public class Menu {
  private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

  Menu() {
    createPizzaMenu();
  }


  private void createPizzaMenu() {
    Pizza pizza1 = new Pizza("Vesuvia", "tomat, skinke, ost", 59);

    Pizza[] pizzas = {pizza1};
    pizzaMenu.addAll(List.of(pizzas));
  }

  public void printMenu() {
    for (int i = 0; i < pizzaMenu.size(); i++) {
      System.out.println(pizzaMenu.get(i));
    }
  }
}
