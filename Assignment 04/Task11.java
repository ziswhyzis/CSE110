import java.util.Scanner;
import java.lang.Math;

class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");

        int sumOfDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sumOfDivisors += i;
        }
        if (sumOfDivisors == n && n > 0)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number");

        sc.close();
    }
}