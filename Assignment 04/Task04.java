import java.util.Scanner;

class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find it's divisors: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

        sc.close();
    }
}