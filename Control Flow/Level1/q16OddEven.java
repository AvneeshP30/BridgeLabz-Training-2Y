package Level1;
import java.util.Scanner;

public class q16OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
        } else {
            int i = 1;
            while (i <= limit) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.print("\n");
            i = 1;
            while (i <= limit) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
