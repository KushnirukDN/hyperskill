import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] array = new int[len];
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();

            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        System.out.println(minNum);
    }
}
