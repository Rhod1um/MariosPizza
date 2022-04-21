import java.util.ArrayList;
import java.util.Locale;

public class Restaurant {
    Menu menu = new Menu();
    Orderlist orderlist = new Orderlist();
    //UI ui = new UI();

    public void takeUserInput (){
        String userInput;
        UI.tellUserToType();
        userInput = UI.userInput();
        evaluateUserInput(userInput);
    }

    public void evaluateUserInput(String userInput){
        switch (userInput.toLowerCase()){
            case "menu", "m", "me", "men" -> menu.printMenu();
            //case "remove", "r", "re", "rem" ->
            default -> evaluateUserInputForPizzaNumbers(userInput);
        }

    }

    //metode()
    // ArrayList med pizzer der bliver til en odre
    // 1 tager userinput og kalder på evalue....()
    // 2 if (pizza der returnes er null)
    // 3 så skal den ikke sættes ind i arrayliste
    // 4 ellers skal den ind i listen
    // while (userinput ikke er lig med 0)
    // 1 tager userinput og kalder på evalue....()
    // 2 if (pizza der returnes er null)
    // 3 så skal den ikke sættes ind i arrayliste
    // 4 ellers skal den ind i listen

    public void evaluateUserInputForPizzaNumbers(String userInput){
        ArrayList <Pizza> pizzasToMakeAnOrder = new ArrayList<>();

        for (int i = 0; i < menu.getMenuSize(); i++) {
            Pizza pizza = menu.returnAPizza(i);
            String pizzaNumber = pizza.getPizzaNumber();
            if (pizzaNumber.equals(userInput)){
                pizzasToMakeAnOrder.add(pizza);
                i = menu.getMenuSize();
            }
        }

    }


}
