import java.util.Scanner;

public abstract class UI {

    public static void tellUserToType(){
        System.out.print("Tast: ");
    }

    public static String userInput() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;
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

    public static void typeInPizzaNumber() {
        System.out.println("Indtast pizza nummeret på den pizza der efterspørges: ");
    }
}
