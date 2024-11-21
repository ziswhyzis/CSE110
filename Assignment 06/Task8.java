import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String result = "";
        boolean lowerCase = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (lowerCase) {
                    if (ch >= 'A' && ch <= 'Z') {
                        result += (char) (ch + 32);
                    } else {
                        result += ch;
                    }
                } else {
                    if (ch >= 'a' && ch <= 'z') {
                        result += (char) (ch - 32);
                    } else {
                        result += ch;
                    }
                }
                lowerCase = !lowerCase;
            } else {
                result += ch;
            }
        }
        System.out.println("Alternating Caps: " + result);
        sc.close();
    }
}