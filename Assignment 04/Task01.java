// (a)
class Task01 {
    public static void main(String[] args) {
        int i = 24;

        while (i >= -6) {
            if (i == -6)
                System.out.println(i);
            else
                System.out.print(i + ", ");
            i -= 6;
        }

// (b)
        i = -10;

        while (i <= 20) {
            if (i == 20)
                System.out.println(i);
            else
                System.out.print(i + ", ");
            i += 5;
        }
    }
}