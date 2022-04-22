import java.util.ArrayList;

public class Restaurant {
    private boolean isRunning = true;
    Menu menu = new Menu();
    OrderList orderList = new OrderList();

    public void cashierProgram(){
        UI.welcomeMessage();
        while (isRunning) {
            UI.tellUserToType();
            String userInput = UI.userInput();
            evaluateUserInput(userInput);
        }
    }

    public void evaluateUserInput(String userInput){
        switch (userInput.toLowerCase()){
            case "menu", "m", "me", "men" -> menu.printMenu();
            case "orderliste", "ol", "orderlist" -> UI.printOrderList(orderList);
            case "order", "ord", "o" -> requestOrder();
            case "exit", "quit", "ex" -> endProgram();
            //case "remove", "r", "re", "rem" -> removeAnOrder();
            default -> UI.notLegitUserInput();
        }

    }

    public void endProgram() {
        UI.endMessage();
        isRunning = false;
    }

    public void requestOrder() {
        UI.beginOrder();
        ArrayList<Pizza> requestedPizzas = new ArrayList<>();
        boolean isRunning = true;
        while (isRunning) {
            UI.typeInPizzaNumber();
            String userInput = UI.userInput();
            for (int i = 0; i < menu.getMenuSize(); i++) {
                Pizza pizza = menu.returnAPizza(i);
                String pizzaNumber = pizza.getPizzaNumber();
                if (userInput.equals(pizzaNumber)) {
                    requestedPizzas.add(pizza);
                    i = menu.getMenuSize();
                } else if (i == menu.getMenuSize() - 1 && !userInput.equals("0")) {
                    UI.pizzaNumberNotFound();
                }
            }
            if (userInput.equals("0")) {
                isRunning = false;
            }
        }
        if (requestedPizzas.size() > 0) {
            orderList.createAnOrder(requestedPizzas);
        } else {
            UI.noOrderWasMade();
        }
    }

    public void removeAnOrder() {
        // printer ud på skærmen at spørge bruger hvilken order nummer der skal slettes
        // scanner brugerens svar
        // Loop igennem orderList og find hver ordre og gem den ordres nummer/ID i en variabel
        // Hvis brugerens svar er lig med den fundne ordres nummer/ID, så skal der kaldes på metode orderList.removeAnOrder()
    }



}
