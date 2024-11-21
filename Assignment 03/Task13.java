import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input the 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Input the 3rd number: ");
        double num3 = sc.nextDouble();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num1 != num3) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
        sc.close();
    }
}