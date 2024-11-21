import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] = {23,100,23,56,100};
        System.out.print("Input array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] uA = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (a[i] == uA[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uA[count] = a[i];
                count++;
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(uA[i] + " ");
        }
        sc.close();
    }
}