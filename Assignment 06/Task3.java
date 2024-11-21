import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the split character: ");
        char split = sc.next().charAt(0);
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == split) {
                System.out.println(temp);
                temp = "";
            } else {
                temp += ch;
            }
        }
        System.out.println(temp);
        sc.close();
    }
}