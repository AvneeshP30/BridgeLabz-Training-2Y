import java.util.Scanner;
public class Q4AreaCircle {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius - ");
        int radius= scanner.nextInt();
        double area = 3.14 * radius*radius;

        System.out.println("The area is : " + area);
        scanner.close();}
}
