import java.util.Scanner;
import java.lang.Math;

class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = (int) Math.pow(10, (int) (Math.log10(n)));
        while (i != 0) {
            int q = (int) (n / i);
            if (i == 1)
                System.out.print(q);
            else
                System.out.print(q + ", ");
            n %= i;
            i /= 10;
        }
        
        sc.close();
    }
}