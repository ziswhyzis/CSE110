public class Task2 {
    public static void main(String[] args) {
        int[] a = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = 0;
                }
            }
        }
        System.out.println("After replacing duplicates with 0:");
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}