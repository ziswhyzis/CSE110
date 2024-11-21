import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the payment: ");
        long pay = sc.nextLong();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age < 18 || pay < 10000) {
            System.out.println("Your tax amounts in 0 Tk");
        }
        else if (10000 <= pay && pay <=20000) {
            System.out.println("Yout tax amounts in " + pay*5/100 + " Tk");
        }
        else if (pay > 20000) {
            System.out.println("Yout tax amounts in " + pay*10/100 + " Tk");
        }
        sc.close();
    }
}