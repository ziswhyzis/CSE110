import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        if( n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the largest number.");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the largest number.");
        }
        else {
            System.out.println(n3 + " is the largest number.");
        }
            sc.close();
    }
}