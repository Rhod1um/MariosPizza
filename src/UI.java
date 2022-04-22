import java.util.Scanner;

public abstract class UI {

    public static void tellUserToType(){
        System.out.print("Tast hvad der ønskes at gøres: ");
    }

    public static String userInput() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;
    }

    public static void welcomeMessage() {
        System.out.println("Velkommen til Marios Pizzabar!\n" +
            "For at bringe menuen op, tast: 'menu'.\n" +
            "For at bringe listen af ordre op, tast: 'orderliste'.\n" +
            "For at lave en ordre, tast: 'order'.\n" +
            "For at fjerne en ordre, tast: 'remove'.\n" +
            "For at slutte programmet, tast: 'exit'.");
    }

    public static void endMessage() {
        System.out.println("Tak for et godt stykke arbejde, ses næste arbejdsdag. Program slut.");
    }

    public static void pizzaNumberNotFound () {
        System.out.println("Ukendt pizza nummer, prøv igen.");
    }

    public static void beginOrder () {
        System.out.println("Starter en ordre.");
    }

    public static void noOrderWasMade () {
        System.out.println("Ordren blev aflyst.");
    }

    public static void notLegitUserInput() {
        System.out.println("Det indtastede er ikke et legit input. Forsøg igen at indtaste en handling.");
    }

    public static void typeInPizzaNumber() {
        System.out.println("Indtast pizza nummeret på den pizza der efterspørges: ");
    }

    public static void printOrderList (OrderList orderList) {
        System.out.println(orderList);
    }
}
