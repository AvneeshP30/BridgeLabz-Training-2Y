package Level3;
import java.util.Scanner;

public class q6Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0, temp = number;

        if (temp == 0) count = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
