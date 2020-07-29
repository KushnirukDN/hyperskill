import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // initial number
        int n2 = n * n; // sudoku size
        int[][] array = new int[n2][n2];
        boolean solved = true;
        int[] newArray = new int[n2];

        //creating a sudoku
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        //checking the condition - number from 1 to n2
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (array[i][j] <= 0 || array[i][j] > n2) {
                    solved = false;
                }
                //horizontal check
                for (int h = j + 1; h <= n2 - 1; h++) {
                    if (array[i][j] == array[i][h]) {
                        solved = false;
                    }
                }
                //vertical check
                for (int v = j + 1; v <= n2 - 1; v++) {
                    if (array[j][i] == array[v][i]) {
                        solved = false;
                    }
                }
            }
        }
        // inside check
        for (int h = 0; h < n2; h += n) {
            for (int p = 0; p < n2; p += n) {
                int k = 0;
                for (int i = h; i < h + n; i++) {
                    for (int j = p; j < p + n; j++) {
                        if (k < n2) {
                            newArray[k] = array[i][j];
                        } else {
                            k = 0;
                        }
                        k++;
                    }
                }
                for (int i = 0; i < n2; i++) {
                    for (int j = i + 1; j <= n2 - 1; j++) {
                        if (newArray[i] == newArray[j]) {
                            solved = false;
                        }
                    }
                }
            }
        }
        System.out.println(solved ? "YES" : "NO");
    }
}