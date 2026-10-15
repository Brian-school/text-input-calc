import java.util.Scanner;
import static java.lang.IO.println;
public class payroll_calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        float hoursWorked = getHours(scanner);
        float payrate = getPayrate(scanner);

        float grossPay = hoursWorked * payrate;
        System.out.printf("%s worked for %.2f hours and earned $%.2f", name, hoursWorked, grossPay);
    }

    public static String getName(Scanner scanner) {
        println("What is your name?");
        return scanner.nextLine();
    }

    public static float getHours(Scanner scanner) {
        println("How many hours have you worked this week?");
        float retval = scanner.nextFloat();
        scanner.nextLine();
        return retval;
    }

    public static float getPayrate(Scanner scanner) {
        println("What is your payrate?");
        float retval = scanner.nextFloat();
        scanner.nextLine();
        return retval;
    }
}
