import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String input = sc.nextLine();
        int vowCount = 0, consCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consCount++;
            }
        }
        if (vowCount > 0 && consCount > 0 && vowCount % 3 == 0 && consCount % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
        sc.close();
    }
}