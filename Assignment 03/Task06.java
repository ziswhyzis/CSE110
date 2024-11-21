import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Number is zero");
        }
        else if (num < 0) {
            System.out.println("Number is negetive");
        }
        else {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            }
            else {
                System.out.println("Number is positive and odd");
            }
        }
        sc.close();
    }
}