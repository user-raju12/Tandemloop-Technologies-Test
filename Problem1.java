
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (+, -, *, /) ");
        String operation = scanner.next();

        double finalResult=0;

        switch (operation) {
            case "+":
            	finalResult = a + b;
                break;
            case "-":
            	finalResult = a - b;
                break;
            case "*":
            	finalResult = a * b;
                break;
            case "/":
                finalResult = a / b;
                break;
            
        }

        System.out.println("Result: " + finalResult);
    }
}
