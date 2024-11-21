import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + a[i]);
        }
        System.out.print("Enter another number: ");
        int nE = sc.nextInt();
        int[] nA = new int[a.length + 1];
        for (int i = 0; i < n; i++) {
            nA[i] = a[i];
        }
        nA[nA.length - 1] = nE;
        for (int i = 0; i < nA.length; i++) {
            System.out.print("After resizing the Array" + nA[i] + " ");
        }
        sc.close();
    }
}