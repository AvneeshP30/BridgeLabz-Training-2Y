/*Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint =>
Take the user input number, check for a positive integer, and use for loop to display
*/
package Level2;
import java.util.Scanner;

public class q4FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (num < 0) {
            System.out.println("The number entered is invalid");
        }
        else {
            if (num % 5 == 0 && num % 3 == 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.println("FizzBuzz");
                }
            }
            else if (num % 5 == 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.println("Buzz");
                }
            }
            else if (num % 3 == 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.println("Fizz");
                }
            }
            else {
                for (int i = 1; i <= num; i++) {
                    System.out.println("num");
                }
            }
        }
    }
}