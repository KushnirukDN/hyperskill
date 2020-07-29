import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int len = scanner.nextInt();
        int[] array = new int[len];


        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
    }
}