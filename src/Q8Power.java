import java.util.Scanner;
public class Q8Power {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base - ");
        int base= scanner.nextInt();
        System.out.print("Enter exponent - ");
        int exponent= scanner.nextInt();
        double answer = Math.pow(base,exponent);

        System.out.println("The answer is : " + answer);
        scanner.close();
    }
}

