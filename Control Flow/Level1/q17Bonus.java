package Level1;
import java.util.Scanner;

public class q17Bonus {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double salary,years,bonus;
        salary = input.nextDouble();
        years = input.nextDouble();
        bonus = (years/100)*salary;
        System.out.println("The bonus amount will be " + bonus);
        }
    }
