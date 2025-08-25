/*Create a program to find the factors of a number taken as user input.
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by I. If true, print the value of i.*/

package Level2;
import java.util.Scanner;

public class q7Factor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
