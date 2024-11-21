import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt(), count = 0;
        for (int i = 2; count < n; i++) {
            boolean p = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p == true) {
                System.out.println(i);
                count++;
            }
        }
        sc.close();
    }
}