/*Write a Program to check if the given number is a prime number or not
Hint =>
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
Use the isPrime boolean variable to store the result*/
package Level3;
import java.util.Scanner;

public class q4Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
    }
















/* int number = input.nextInt();
        int c = 0;
        for (int i = 2; i <= number ; i++) {
            if(number%i==0){
                c++;
            }
        }
        if((c++)>1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }*/