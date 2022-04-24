import java.util.Scanner;

public abstract class UI {
    private static final String BOLD_TXT = "\033[1;97m";
    private static final String END_TXT = "\033[0m";

    public static void tellUserToType(){
        System.out.print("Tast hvad der ønskes at gøres: ");
    }

    public static String userInput() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;
    }

    public static void welcomeMessage() {
        System.out.printf("""
            %sVelkommen til Marios Pizzabar!%s
            
            For at bringe menuen op, tast: %s'menu'%s.
            For at bringe listen af ordre op, tast: %s'orderliste'%s.
            For at lave en ordre, tast: %s'order'%s.
            For at fjerne en ordre, tast: %s'remove'%s.
            For at slutte programmet, tast: %s'exit'%s.
            
            """, BOLD_TXT, END_TXT, BOLD_TXT, END_TXT, BOLD_TXT, END_TXT, BOLD_TXT, END_TXT, BOLD_TXT, END_TXT, BOLD_TXT, END_TXT);
    }

    public static void endMessage() {
        System.out.println("Tak for et godt stykke arbejde, ses næste arbejdsdag. Program slut.");
    }

    public static void pizzaNumberNotFound () {
        System.out.println("Ukendt pizza nummer, prøv igen.");
    }

    public static void orderNumberNotFound() {
        System.out.println("Ukendt ordre nummer, prøv igen.");
    }

    public static void beginOrder () {
        System.out.println(BOLD_TXT + "Starter en ordre." + END_TXT);
    }

    public static void anOrderWasMade(Order order) {
        String orderNumber = order.getOrderNumber();
        System.out.println(BOLD_TXT + "Ordre nr. " + orderNumber + END_TXT + " blev succesfuldt skabt.");
    }

    public static void removesOrder() {
        System.out.println(BOLD_TXT + "Fjerner en ordre." + END_TXT);
    }

    public static void typeInOrderNumber() {
        System.out.print("Indtast order nummeret på den ordrer der skal fjernes: ");
    }

    public static void noOrderWasMade () {
        System.out.println(BOLD_TXT + "Ordren blev aflyst." + END_TXT);
    }

    public static void cancelRemoveOrder() {
        System.out.println(BOLD_TXT + "Fjern en ordre blev aflyst." + END_TXT);
    }

    public static void orderWasRemoved(Order order) {
        String orderNumber = order.getOrderNumber();
        System.out.println(BOLD_TXT + "Ordre nr. " + orderNumber + END_TXT + " blev fjernet succesfuldt.");
    }

    public static void noOrdersToRemove() {
        System.out.println("Der er ingen ordre på listen at fjerne.");
    }

    public static void notLegitUserInput() {
        System.out.println("Det indtastede er ikke et legit input. Forsøg igen at indtaste en handling.");
    }

    public static void typeInPizzaNumber() {
        System.out.print("Indtast pizza nummeret på den pizza der efterspørges: ");
    }

    public static void printOrderList (OrderList orderList) {
        System.out.println(orderList);
    }

    public static void printMenu(Menu menu) {
        System.out.printf("%70sPIZZAER%s\n", BOLD_TXT, END_TXT);
        for (int i = 0; i < menu.getPizzaMenuSize(); i++) {
            Pizza pizza = menu.returnAPizza(i);
            System.out.println(pizza);
        }
    }

    public static void printEmptyLine() {
        System.out.println();
    }
}
