import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int l = array.length;
        String[] newArray = new String[l];
        int r = scanner.nextInt();


        for (int i = 0; i < l; i++) {
            int newIndex = i + r;

            for (; newIndex >= l;) {
                newIndex = newIndex - l;
            }
            newArray[newIndex] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}



