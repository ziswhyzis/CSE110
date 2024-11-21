import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length() / 2;
        boolean isPal = true;
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPal = false;
                break;
            }
        }
        if (isPal) {
            System.out.println("True");
        } else
            System.out.println("False");
        sc.close();
    }
}