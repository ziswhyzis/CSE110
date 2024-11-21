import java.util.Scanner;

class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int digit = 0;

        while (n > 0) {
            n /= 10;
            digit++;
        }
        System.out.println("Total digits = " + digit);

        sc.close();
    }
}