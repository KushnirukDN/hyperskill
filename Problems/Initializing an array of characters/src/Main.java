import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // initial number
        int n2 = n * n; // sudoku size
        int[][] array = new int[n2][n2];
        int[] newArray = new int[n2];
        boolean solved = true;

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
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
                    for (int j =i + 1; j <= n2 - 1; j++) {
                            if (newArray[i] == newArray[j]) {
                                solved = false;
                                //last inside check
                        }
                    }
                }
                for (int i = 0; i < n2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.print(solved);
            }
        }
    }
}

/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
5 8 9 6 7 4 2 1 3
7 4 3 1 8 2 9 5 6
1 2 6 9 5 3 8 7 4
9 3 5 4 2 1 7 6 8
4 1 2 8 6 7 3 9 5
6 7 8 3 9 5 1 4 2
8 6 4 2 1 9 5 3 7
3 9 7 5 4 8 6 2 1
2 5 1 7 3 6 4 8 9
1 2 3 4
3 4 2 1
2 1 4 3
4 3 1 2
 */