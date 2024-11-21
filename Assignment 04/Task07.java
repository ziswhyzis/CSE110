import java.util.Scanner;

class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int s = 0;
        while (i <= 10) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            s += n;
            System.out.println("Sum = " + s);
            i++;
        }

        sc.close();
    }
}