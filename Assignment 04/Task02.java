import java.util.Scanner;

class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int s = 0;

        System.out.println("Input the " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            s += num;
        }
        System.out.println("The sum of " + n + " no is: " + s);
        System.out.println("The Average is: " + (double) s / n);

        sc.close();
    }
}