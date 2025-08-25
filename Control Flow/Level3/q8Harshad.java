package Level3;
import java.util.Scanner;

public class q8Harshad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum, original, digit;
        number = input.nextInt();
        sum = 0;
        original = number;
        while(original != 0){
            digit = original % 10;
            sum+= digit;
            original = original/10;
        }
        if(number%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}