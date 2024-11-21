import java.util.Scanner;

class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int neg = 0;
        int noneg = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num < 0)
                neg++;
            else
                noneg++;
        }
        System.out.println(noneg + " Non-negative Numbers");
        System.out.println(neg + " Negative Numbers");

        sc.close();
    }
}