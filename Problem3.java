import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();

        if (x < 1) {
            System.out.println("x should be greater than or equal to 1.");
        } else {
            generateSeries(x);
        }

        scanner.close();
    }

    public static void generateSeries(int x) {
        for (int i = 1; i <= x; i += 2) {
            System.out.print(i);

            // Add a comma and space unless it's the last number
            if (i < x) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Print a newline at the end
    }
}
