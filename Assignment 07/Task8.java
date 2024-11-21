import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Please enter the elements of the arr1: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Please enter the length of array 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        boolean isSubset = true;
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }
        if (isSubset) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
        
        sc.close();
    }
}