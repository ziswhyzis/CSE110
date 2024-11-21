import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if (a > b && b > c) {
            if (b > c) {
                System.out.println("Largest = " + a + " and Smallest = " + c);
            } else {
                System.out.println("Largest = " + a + " and Smallest = " + b);
            }
        } else if (b > a && a > c) {
            if (a > c) {
                System.out.println("Largest = " + b + " and Smallest = " + c);
            } else {
                System.out.println("Largest = " + b + " and Smallest = " + a);
            }
        } else {
            if (a > b) {
                System.out.println("Largest = " + c + " and Smallest = " + b);
            } else {
                System.out.println("Largest = " + c + " and Smallest = " + a);
            }
        }
        sc.close();
    }
}