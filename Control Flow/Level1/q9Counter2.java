/*Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint =>
Create a variable counter to take user inputted value for the countdown.
Use the for loop to check if the counter is 1
Inside a for loop, print the value of the counter and decrement the counter.
*/

package Level1;
import java.util.Scanner;

public class q9Counter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rocket;
        rocket = input.nextInt();
        for(int i = rocket; i>=1; i--){
            System.out.println(i);
        }

    }
}