import java.util.Objects;
import java.util.Scanner;

import static java.lang.IO.println;

public class basic_calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        println("What is the first number you want to calculate with?");
        int num1 = scanner.nextInt();
        //scanner.nextLine();
        println("What is the second number you want to calculate with?");
        int num2 = scanner.nextInt();
        //scanner.nextLine();

        println("What operation would you like to perform on " + num1 + " and " + num2 + "?");

        println("Options: add sub mult div");
        println("Result will be: " + num1 + " (operation) " + num2);

        boolean operationValid = false;
        String operation = "";
        while (!operationValid){
            operation = scanner.nextLine();

            if (Objects.equals(operation, "add") || Objects.equals(operation, "sub") ||
                    Objects.equals(operation, "mult") || Objects.equals(operation, "div")) {
                operationValid = true;
            } else {
              println("Invalid input. Valid options are \"add\" \"sub\" \"mult\" \"div\"");
            }
        }
        int result = 0;
        if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("sub")) {
            result = num1 - num2;
        } else if (operation.equals("mult")) {
            result = num1 * num2;
        } else if (operation.equals("div")) {
            result = num1 / num2;
        }
        println("Result: " + result);
    }
}
