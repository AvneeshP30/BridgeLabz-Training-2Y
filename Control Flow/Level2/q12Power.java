/*Create a program to find the power of a number.
Hint =>
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/
package Level2;
import java.util.Scanner;

public class q12Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,result,power,i;
        num = input.nextInt();
        power = input.nextInt();
        result=1;
        for(i=1;i<=power;i++){
            result*=num;
        }
        System.out.println(result);
    }
}
