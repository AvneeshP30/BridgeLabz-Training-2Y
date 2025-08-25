package Level3;
import java.util.Scanner;

public class q3Marks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double physics,chemistry,maths,average;
        String grade,remarks;

        System.out.print("Enter marks in Physics: ");
        physics = input.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        chemistry = input.nextDouble();

        System.out.print("Enter marks in Maths: ");
        maths = input.nextDouble();

        average = (physics + chemistry + maths) / 3;
        System.out.printf("Average Mark: %.2f%%\n", average);

        if (average >= 80) {
            System.out.println("Grade       : A");
            System.out.println("Remarks     : Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade       : B");
            System.out.println("Remarks     : Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade       : C");
            System.out.println("Remarks     : Level 2, below, but approaching agency-normalized standards");
        } else if (average >= 50) {
            System.out.println("Grade       : D");
            System.out.println("Remarks     : Level 1, well below agency-normalized standards");
        } else if (average >= 40) {
            System.out.println("Grade       : E");
            System.out.println("Remarks     : Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade       : R");
            System.out.println("Remarks     : Remedial standards");
        }
    }
}
