import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextDouble();
        }
        double max = a[0];
        int maxIndex = 0;
        double min = a[0];
        int minIndex = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
            sum += a[i];
        }
        double avg = sum / n;
        System.out.println("Maximum element " + max + " found at index " + maxIndex);
        System.out.println("Minimum element " + min + " found at index " + minIndex);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
        sc.close();
    }
}