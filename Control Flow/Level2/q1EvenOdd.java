/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint =>
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
*/
package Level2;
import java.util.Scanner;

public class q1EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (num<1){
            System.out.println("Enter a valid Natural number");
        }
        else {
            for(int i = 1; i<=num ; i++){
                if(i%2 != 0){
                    System.out.println("The number " + i + " is odd.");
                }
                else{
                    System.out.println("The number " + i + " is even.");
                }
            }
        }
    }
}