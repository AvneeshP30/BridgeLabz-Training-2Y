/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___*/

package Level1;
import java.util.Scanner;

public class q1Divisibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
    }
}
