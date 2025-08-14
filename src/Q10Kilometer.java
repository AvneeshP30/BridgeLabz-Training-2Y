import java.util.Scanner;
public class Q10Kilometer {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance - ");
        double distance= scanner.nextDouble();
        double mile = distance * 0.621371 ;

        System.out.println("The answer is : " + mile);
        scanner.close();}
}

