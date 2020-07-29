import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] a = new int[l];
        int r = 1;
        int[] newArray = new int[l];

        for (int i = 0; i < l; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < l; i++) {
            int newIndex = i + r;

            for (; newIndex >= l;) {
                newIndex = newIndex - l;
            }
            newArray[newIndex] = a[i];
        }
        for (int i = 0; i < l; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}