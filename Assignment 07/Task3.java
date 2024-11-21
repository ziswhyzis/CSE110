import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
// a.
        int[] rA = new int[n];
        for (int i = 0; i < n; i++) {
            rA[i] = a[n - i - 1];
        }
        System.out.println("Reversed using a new array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rA[i] + " ");
        }
        System.out.println();
// b.
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println("Reversed the original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}