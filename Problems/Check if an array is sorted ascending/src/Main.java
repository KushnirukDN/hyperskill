import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        boolean sorted = true;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < len; i++) {
            if (array[i] < array[i - 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}