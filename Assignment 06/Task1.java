import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(), temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                temp += (char) (ch - 32);
            } else {
                temp += ch;
            }
        }
        System.out.println("Upper cased: " + temp);
        sc.close();
    }
}