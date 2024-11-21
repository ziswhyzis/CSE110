import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int num = sc.nextInt();

        if (100 >= num && num >= 90) {
            System.out.println("Your grade is A");
        }
        else if (89 >= num && num >= 85) {
            System.out.println("Your grade is A-");
        }
        else if (84 >= num && num >= 70) {
            System.out.println("Your grade is B");
        }
        else if (69 >= num && num >= 57) {
            System.out.println("Your grade is C");
        }
        else if (56 >= num && num >= 50) {
            System.out.println("Your grade is D");
        }
        else if (num < 50) {
            System.out.println("Your grade is F");
        }
        sc.close();
    }
}