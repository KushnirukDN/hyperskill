import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] array = new int[len];
        int maxPair = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < len - 1; i++) {
            int maxPairNew = array[i] * array[i + 1];
            if (maxPair < maxPairNew) {
                maxPair = maxPairNew;
            }
        }
        System.out.println(maxPair);
    }
}
