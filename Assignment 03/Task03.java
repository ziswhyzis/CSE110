import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operator: ");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }
        sc.close();
    }
}