import java.util.Scanner;
public class Q6Interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal - ");
        double principal= scanner.nextDouble();
        System.out.print("Enter rate - ");
        double rate= scanner.nextDouble();
        System.out.print("Enter time(in years) - ");
        double time= scanner.nextDouble();
        double interest = (principal * rate * time) / 100;

        System.out.println("The answer is : " + interest);
        scanner.close();}
}


