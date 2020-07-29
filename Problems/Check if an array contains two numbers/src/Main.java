import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        boolean result = false;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < length; i++) {
            if (array[i] == n && array[i - 1] == m) {
                result = true;
            } else if (array[i] == m && array[i - 1] == n) {
                result = true;
            }
        }
        System.out.println(result);
    }
}