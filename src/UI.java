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
}
