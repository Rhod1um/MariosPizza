import java.util.ArrayList;
import java.util.List;

public class Menu {
  private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

  Menu() {
    createPizzaMenu();
  }

  public Pizza returnAPizza (int i){
    return pizzaMenu.get(i);
  }

  public int getPizzaMenuSize(){
    return pizzaMenu.size();
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
    Pizza pizza15 = new Pizza("Bella Milano", "tomatsauce, ost, kødstrimler og bacon", 57);
    Pizza pizza16 = new Pizza("Sofus", "tomatsauce, ost, kebab og salat", 57);
    Pizza pizza17 = new Pizza("Viking", "tomatsauce, ost, grøn peberfrugt og oksekød", 57);
    Pizza pizza18 = new Pizza("La Luna", "tomatsauce, ost, kødstrimler og champignon", 57);
    Pizza pizza19 = new Pizza("Mimosa", "tomatsauce, ost, kebab og champignon", 57);
    Pizza pizza20 = new Pizza("Venedig", "tomatsauce, ost, kylling og hvidløg", 57);
    Pizza pizza21 = new Pizza("Pollo", "tomatsauce, ost, bacon og løg", 57);
    Pizza pizza22 = new Pizza("San Remo", "tomatsauce, ost, pepperoni og kebab", 57);
    Pizza pizza23 = new Pizza("Bari", "tomatsauce, ost, grøn peberfrugt og hvidløg", 57);
    Pizza pizza24 = new Pizza("La Fiesta", "tomatsauce, ost, bacon og kylling", 57);
    Pizza pizza25 = new Pizza("Juventus", "tomatsauce, ost, kødsovs og løg", 57);
    Pizza pizza26 = new Pizza("Roma", "tomatsauce, ost, skinke og æg", 57);
    Pizza pizza27 = new Pizza("Capricciosa", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza28 = new Pizza("Mama Rosa", "tomatsauce, ost, champignon og oregano", 57);
    Pizza pizza29 = new Pizza("Silicia", "tomatsauce, ost, ananas og rød peberfrugt", 57);
    Pizza pizza30 = new Pizza("Alanya", "tomatsauce, ost, kebab og rejer", 57);

    Pizza[] pizzas = {pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10, pizza11, pizza12, pizza13, pizza14, pizza15, pizza16, pizza17, pizza18, pizza19, pizza20, pizza21, pizza22, pizza23, pizza24, pizza25, pizza26, pizza27, pizza28, pizza29, pizza30};
    pizzaMenu.addAll(List.of(pizzas));
  }

}
