import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iMax = 0;
        int max = 0;
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < len; j++) {
            if (array[j] > max) {
                max = array[j];
                iMax = j;
            }
        }
        System.out.println(iMax);
    }
}