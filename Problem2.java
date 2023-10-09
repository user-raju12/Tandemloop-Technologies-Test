import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();
        
        if (x < 1) {
            System.out.println("x should be greater than or equal to 1");
        } else {
        	seriesNumber(x);
        }
        
       
    }

    public static void seriesNumber(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(2 * i - 1);

            
            if (i < x) {
                System.out.print(", ");
            }
        }
    }
}
