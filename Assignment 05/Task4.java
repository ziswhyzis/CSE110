import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter test case: ");
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            System.out.println("Enter the value of x and y: ");
            int x = sc.nextInt(), y = sc.nextInt();
            int sum = 0;
            int count = 0;
            while (count < y) {
                if (x % 2 != 0) {
                    sum += x;
                    count++;
                }
                x++;
            }
            System.out.println("Total sum: " + sum);
        }
        sc.close();
    }
}