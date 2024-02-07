// Observer Pattern + Command Pattern.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FootballResultObject object = new FootballResult();

        object.registerSubscriber(new FootballResultSubscriber("Person 1"));
        object.registerSubscriber(new FootballResultSubscriber("Person 2"));

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter Score (e.g., Thai  1-0 UAE) or press Enter to finish: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                exit = true;
            } else {
                object.notifySubscriber(input);
            }
        }
        scanner.close();
    }
}
