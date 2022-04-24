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
        UI.printEmptyLine();
        switch (userInput.toLowerCase()){
            case "menu", "m", "me", "men" -> UI.printMenu(menu);
            case "orderliste", "ol", "orderlist" -> UI.printOrderList(orderList);
            case "order", "ord", "o" -> requestOrder();
            case "exit", "quit", "ex" -> endProgram();
            case "remove", "r", "re", "rem" -> removeAnOrder();
            default -> UI.notLegitUserInput();
        }
        UI.printEmptyLine();
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
            for (int i = 0; i < menu.getPizzaMenuSize(); i++) {
                Pizza pizza = menu.returnAPizza(i);
                String pizzaNumber = pizza.getPizzaNumber();
                if (userInput.equals(pizzaNumber)) {
                    requestedPizzas.add(pizza);
                    i = menu.getPizzaMenuSize();
                } else if (i == menu.getPizzaMenuSize() - 1 && !userInput.equals("0")) {
                    UI.pizzaNumberNotFound();
                }
            }
            if (userInput.equals("0")) {
                isRunning = false;
            }
        }
        if (requestedPizzas.size() > 0) {
            orderList.createAnOrder(requestedPizzas);
            Order newestOrder = orderList.getAnOrder(orderList.getOrders().size() - 1);
            UI.anOrderWasMade(newestOrder);
        } else {
            UI.noOrderWasMade();
        }
    }

    public void removeAnOrder() {
        int amountOfOrders = orderList.getOrders().size();
        if (amountOfOrders > 0) {
            UI.removesOrder();
            boolean isNotAnOrder = true;
            while (isNotAnOrder) {
                UI.typeInOrderNumber();
                String userInput = UI.userInput();
                if (!userInput.equals("0")) {
                    for (int i = 0; i < amountOfOrders; i++) {
                        Order order = orderList.getAnOrder(i);
                        String orderNumber = order.getOrderNumber();
                        if (userInput.equals(orderNumber)) {
                            UI.orderWasRemoved(order);
                            orderList.removeAnOrder(order);
                            isNotAnOrder = false;
                            i = amountOfOrders;
                        } else if (i == amountOfOrders - 1) {
                            UI.orderNumberNotFound();
                            UI.printEmptyLine();
                        }
                    }
                } else {
                    UI.cancelRemoveOrder();
                    isNotAnOrder = false;
                }
            }
        } else {
           UI.noOrdersToRemove();
        }
    }
}
