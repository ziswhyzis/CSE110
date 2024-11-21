import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of row and column: ");
        int x = sc.nextInt(), y = sc.nextInt();
        for (int i = 1; i<=x; i++) {
            for (int j = 1; j<=y; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}