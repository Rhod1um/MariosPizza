import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Restaurant().cashierProgram();
        //new Main().go();
    }

    void go() {
        OrderList orderList = new OrderList();
        Menu menu = new Menu();
        Pizza pizza1 = menu.returnAPizza(0);
        Pizza pizza2 = menu.returnAPizza(1);
        Pizza pizza3 = menu.returnAPizza(2);
        Pizza[] pizzas1 = {pizza1, pizza2, pizza3};
        ArrayList<Pizza> enOrdre1 = new ArrayList<>(List.of(pizzas1));

        Pizza pizza4 = menu.returnAPizza(7);
        Pizza pizza5 = menu.returnAPizza(4);
        Pizza pizza6 = menu.returnAPizza(10);
        Pizza[] pizzas2 = {pizza4, pizza5, pizza6};
        ArrayList<Pizza> enOrdre2 = new ArrayList<>(List.of(pizzas2));

        orderList.createAnOrder(enOrdre1);
        orderList.createAnOrder(enOrdre2);
        System.out.println(orderList);

        menu.printMenu();
    }
}
