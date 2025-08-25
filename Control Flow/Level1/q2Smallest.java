/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/
package Level1;
import java.util.Scanner;

public class q2Smallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if (num1<num2 && num1<num3) {
            System.out.println("The first number " + num1 + "is the smallest");
        }
        else{
            System.out.println("The first number isn't the smallest");
        }
        }
    }

