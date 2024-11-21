import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        if (s1 == s2 && s2 == s3) {
            System.out.println("This is a Equilateral triangle");
        }
        else if (s1 == s2 || s2 == s3) {
            System.out.println("This is a Isosceles triangle");
        }
        else {
            System.out.println("This is a Scalene triangle");
        }
        sc.close();
    }
}