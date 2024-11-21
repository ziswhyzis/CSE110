import java.util.Scanner;

class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        int s = 0;
        int i = 1;
        int count = 0;

        while (count < n) {
            System.out.println(i);
            s += i;
            i += 2;
            count++;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + s);

        sc.close();
    }
}
