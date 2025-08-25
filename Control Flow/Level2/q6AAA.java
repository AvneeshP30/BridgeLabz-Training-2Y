package Level2;
import java.util.Scanner;

public class q6AAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        System.out.println("\nResults:");

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("The youngest friend is: Amar (Age: " + amarAge + ")");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("The youngest friend is: Akbar (Age: " + akbarAge + ")");
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("The youngest friend is: Anthony (Age: " + anthonyAge + ")");
        } else {
            System.out.println("There is a tie in age.");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("The tallest friend is: Amar (Height: " + amarHeight + " cm)");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("The tallest friend is: Akbar (Height: " + akbarHeight + " cm)");
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("The tallest friend is: Anthony (Height: " + anthonyHeight + " cm)");
        } else {
            System.out.println("There is a tie in height.");
        }
    }
}