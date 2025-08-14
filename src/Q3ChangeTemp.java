import java.util.Scanner;
public class Q3ChangeTemp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temp - ");
        int temp1= scanner.nextInt();
        int temp2 = (temp1 * 9/5) + 32;

        System.out.println("The temp in fahrenheit is : " + temp2);
        scanner.close();}
}

