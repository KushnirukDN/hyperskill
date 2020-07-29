import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = m;
        int n2 = n * n + 1;
        int[][] array = new int[n][n];
        int num = 1;
        int k = 0;
        for (int i = 0, j = 0; i < n; i++) {
            for (; j < n && num < n2; j++) {
                array[i][j] = num;
                num++;
            }
            i++;
            j--;
            for (; i < n && num < n2; i++) {
                array[i][j] = num;
                num++;
            }
            i--;
            j--;
            for (; j >= k && num < n2; j--){
                array[i][j] = num;
                num++;
            }
            j++;
            i--;
            for (; i > k && num < n2; i--) {
                array[i][j] = num;
                num++;
            }
            j++;
            n--;
            k++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}