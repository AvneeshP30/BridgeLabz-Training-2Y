package Level3;
import java.util.Scanner;

public class q5Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sum,original,digit;
        number = input.nextInt();
        sum = 0;
        original = number;
        while(original != 0){
            digit = original % 10;
            sum+= Math.pow(digit,3);
            original = original/10;
        }
        if(number==sum){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

