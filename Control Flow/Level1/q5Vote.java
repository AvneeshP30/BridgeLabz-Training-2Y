package Level1;
import java.util.Scanner;

public class q5Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
    }
}

