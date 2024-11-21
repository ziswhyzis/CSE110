import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number:");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int searchElement = sc.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] == searchElement) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println(searchElement + " is at index " + index);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}