package Level1;
import java.util.Scanner;

public class q18Mult {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9 ; i++) {
            int prod = number*i;
            System.out.println(number +  " * " + i + " = " + prod );
        }
    }
}
