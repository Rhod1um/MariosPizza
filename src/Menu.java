import java.util.ArrayList;
import java.util.List;

public class Menu {
  private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

  Menu() {
    createPizzaMenu();
  }


  private void createPizzaMenu() {
    Pizza pizza1 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza2 = new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
    Pizza pizza3 = new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
    Pizza pizza4 = new Pizza("Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
    Pizza pizza5 = new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
    Pizza pizza6 = new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57);
    Pizza pizza7 = new Pizza("Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
    Pizza pizza8 = new Pizza("Victoria", "tomatsauce, ost, skinke, ananas, champignon og oregano", 61);
    Pizza pizza9 = new Pizza("Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
    Pizza pizza10 = new Pizza("Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61);
    Pizza pizza11 = new Pizza("Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61);
    Pizza pizza12 = new Pizza("Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61);
    Pizza pizza13 = new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61);
    Pizza pizza14 = new Pizza("Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);
    Pizza pizza15 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza16 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza17 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza18 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza19 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza20 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza21 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza22 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza23 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza24 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza25 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza26 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza27 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza28 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza29 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza30 = new Pizza("Vesuvia", "tomatsauce, ost, skinke og oregano", 57);

    Pizza[] pizzas = {pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10, pizza11, pizza12, pizza13, pizza14, pizza15, pizza16, pizza17, pizza18, pizza19, pizza20, pizza21, pizza22, pizza23, pizza24, pizza25, pizza26, pizza27, pizza28, pizza29, pizza30};
    pizzaMenu.addAll(List.of(pizzas));
  }

  public void printMenu() {
    for (int i = 0; i < pizzaMenu.size(); i++) {
      System.out.println(pizzaMenu.get(i));
    }
  }
}
