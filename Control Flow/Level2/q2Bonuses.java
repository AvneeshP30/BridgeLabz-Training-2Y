/*Create a program to find the bonuses of employees based on their years of service.
        Hint =>
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.*/
package Level2;
import java.util.Scanner;

public class q2Bonuses {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salary,years,bonus;
        salary = input.nextDouble();
        years = input.nextDouble();
        bonus = (years/100)*salary;
        System.out.println("The bonus amount will be " + bonus);
    }
}
