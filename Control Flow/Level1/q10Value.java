/*Write a program to find the sum of numbers until the user enters 0
Hint =>
a.Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
b.Use the while loop to check if the user entered is 0
c.If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
d.The loop will continue till the user enters zero and outside the loop display the total value
*/

package Level1;
import java.util.Scanner;

public class q10Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double num;

        num = input.nextDouble();

        while(num!=0){
            total+=num;
            num = input.nextDouble();
        }
        System.out.println("The total sum is " + total);
    }
}