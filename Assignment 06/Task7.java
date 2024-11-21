import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two strings: ");
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            boolean isCommon = false;
            for (int j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);
                if (ch1 == ch2) {
                    isCommon = true;
                    break;
                }
            }
            if (isCommon == false) {
                result += ch1;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch1 = str2.charAt(i);
            boolean isCommon = false;
            for (int j = 0; j < str1.length(); j++) {
                char ch2 = str1.charAt(j);
                if (ch1 == ch2) {
                    isCommon = true;
                    break;
                }
            }
            if (isCommon == false) {
                result += ch1;
            }
        }
        String upperResult = "";
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperResult += (char) (ch - 32);
            } else {
                upperResult += ch;
            }
        }
        System.out.println("Common characters: " + upperResult);
        sc.close();
    }
}