import java.util.Scanner;
public class Q9Average {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 - ");
        int num1= scanner.nextInt();
        System.out.print("Enter num2 - ");
        int num2= scanner.nextInt();
        System.out.print("Enter num3 - ");
        int num3= scanner.nextInt();
        float average = (num1 + num2 + num3) / 3;

        System.out.println("The answer is : " + average);
        scanner.close();

    }


}
