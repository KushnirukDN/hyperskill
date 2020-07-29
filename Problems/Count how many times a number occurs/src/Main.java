import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int counter = 0;

        for (int m : array) {
            if (m == n) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}