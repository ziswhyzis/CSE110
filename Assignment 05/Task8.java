import java.util.Scanner;
import java.lang.Math;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int sum = 0, pos = 0, rem;
            int num = i;
            while (num > 0) {
                pos++;
                num /= 10;
            }
            num = i;
            while (num > 0) {
                rem = num % 10;
                sum += Math.pow(rem, pos);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
        sc.close();
    }
}