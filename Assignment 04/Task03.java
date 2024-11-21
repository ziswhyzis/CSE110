import java.util.Scanner;

class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if (num < 0)
                break;
            System.out.println(num + " ^ 2 = " + num * num);
        }

        sc.close();
    }
}