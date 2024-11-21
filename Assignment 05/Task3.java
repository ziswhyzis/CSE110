import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int count = 0;
            if (n < 0 || n % 2 != 0) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            System.out.println(n + " has  " + count + " divisors");
        }
        sc.close();
    }
}