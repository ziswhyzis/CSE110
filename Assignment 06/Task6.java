import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reverse = "", current = "";
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (reverse.equals("")) {
                    reverse = current;
                } else {
                    reverse = current + " " + reverse;
                }
                current = "";
            } else {
                current += str.charAt(i);
            }
        }
        System.out.println("Reversed: " + reverse);
        sc.close();
    }
}