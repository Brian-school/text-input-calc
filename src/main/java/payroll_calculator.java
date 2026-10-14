import java.util.Scanner;
import static java.lang.IO.println;
public class payroll_calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        println("What is your name?");
        String name = scanner.nextLine();

        println("How many hours have you worked this week?");
        float hoursWorked = scanner.nextFloat();
        scanner.nextLine();
        println("What is your payrate?");
        float payrate = scanner.nextFloat();
        scanner.nextLine();

        float grossPay = hoursWorked * payrate;
        System.out.printf("%s worked for %.2f hours and earned $%.2f", name, hoursWorked, grossPay);
    }
}
