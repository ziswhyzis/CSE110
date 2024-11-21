import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the BRACU student ID: ");
        long std_id = sc.nextLong();
        long year = std_id/1000000;
        long sem = (std_id/100000)%10;

        if (sem == 1) {
            System.out.println("Student Joined BRAC in Spring " + year);
        }
        else if (sem == 2) {
            System.out.println("Student Joined BRAC in Fall " + year);
        }
        else if (sem == 3) {
            System.out.println("Student Joined BRAC in Summer " + year);
        }
        sc.close();
    }
}