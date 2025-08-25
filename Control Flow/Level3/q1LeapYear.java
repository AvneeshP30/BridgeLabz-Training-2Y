/*Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical */
package Level3;
import java.util.Scanner;

public class q1LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year<1582){
            System.out.println("Invalid");
        }
        else{
            if((year%4 == 0 && year%100 != 0) || year%400 == 0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
    }
}
