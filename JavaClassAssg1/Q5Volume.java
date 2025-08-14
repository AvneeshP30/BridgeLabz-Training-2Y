import java.util.Scanner;
public class Q5Volume {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius - ");
        int radius= scanner.nextInt();
        System.out.print("Enter height - ");
        int height= scanner.nextInt();
        double cyclinder = 3.14 * radius * radius * height;

        System.out.println("The answer is : " + cyclinder);
        scanner.close();

    }
}
