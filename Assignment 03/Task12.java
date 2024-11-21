import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka): ");
        int money2pay = sc.nextInt();
        System.out.print("Enter the amount, customer gave(Taka): ");
        int moneypaid = sc.nextInt();
        int change = moneypaid - money2pay;
        int count = 0;

        if (money2pay > moneypaid) {
            System.out.println("Please pay " + (money2pay - moneypaid) + " taka more.");
        } else {
            System.out.println("The returned amount is " + change + " taka");
            if (change >= 100) {
                count = change / 100;
                change %= 100;
            }
            System.out.println("100 taka note: " + count);
            count = 0;
            if (change >= 50) {
                count = change / 50;
                change %= 50;
            }
            System.out.println("50 taka note: " + count);
            count = 0;
            if (change >= 20) {
                count = change / 20;
                change %= 20;
            }
            System.out.println("20 taka note: " + count);
            count = 0;
            if (change >= 10) {
                count = change / 10;
                change %= 10;
            }
            System.out.println("10 taka note: " + count);
            count = 0;
            if (change >= 5) {
                count = change / 5;
                change %= 5;
            }
            System.out.println("5 taka coin: " + count);
            count = 0;
            if (change >= 2) {
                count = change / 2;
                change %= 2;
            }
            System.out.println("2 taka coin: " + count);
            count = 0;
            if (change >= 1) {
                count = change / 1;
                change %= 1;
            }
            System.out.println("1 taka coin: " + count);

        }
        sc.close();
    }
}