package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[3][3];
        int[] newMove = new int[2];
        boolean winsX = false;
        boolean winsO = false;
        boolean emptyCells = false;
        boolean correctMove = true;
        int X = 0;
        int O = 0;
        int n = 0;
        int mark = 0;
        int x = newMove[0];
        int y = newMove[1];

        //Get the 3x3 field from the input
        String line = "_________";
        char[] ttt = line.toCharArray();

        // Printing the array
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                array[i][j] = ttt[n];
                n++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        // input and analyze the move`
        System.out.println("Enter the coordinates: ");
        for (int m = 0; m < 9 || winsX || winsO; m++) {
            do {
                correctMove = true;
                scanner.nextLine();
                if (!scanner.hasNextInt()) {
                    System.out.println("You should enter numbers!");
                    correctMove = false;
                } else {
                    for (int i = 0; i < 2; i++) {
                        newMove[i] = scanner.nextInt();
                        y = newMove[1];
                        x = newMove[0];
                    }
                }
                if (newMove[0] < 1 || newMove[0] > 3 || newMove[1] < 1 || newMove[1] > 3) {
                    correctMove = false;
                    System.out.println("Coordinates should be from 1 to 3");
                } else {
                    newMove[0] = 3 - y;
                    newMove[1] = x - 1;
                    System.out.println(newMove[0] + " " + newMove[1]);
                    if (array[newMove[0]][newMove[1]] != '_' && correctMove == true) {
                        correctMove = false;
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (mark % 2 == 0) {
                            array[newMove[0]][newMove[1]] = 'X';
                        } else {
                            array[newMove[0]][newMove[1]] = 'O';
                        }
                    }
                    mark++;
                }
            } while (!correctMove);

            // Printing the array
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("---------");

            // checking array and counting parameters
            for (int i = 0; i < 3; i++) {
                for (int j = 0, sumH = 0, sumV = 0; j < 3; j++) {
                    if (array[i][j] == 'X') {
                        X += 1;
                    }
                    if (array[i][j] == 'O') {
                        O += 1;
                    }
                    if (array[i][j] == '_') {
                        emptyCells = true;
                    }
                    //horizontal check
                    sumH += array[i][j];
                    if (sumH == 264) {
                        winsX = true;
                    } else if (sumH == 237) {
                        winsO = true;
                    }
                    //vertical check
                    sumV += array[j][i];
                    if (sumV == 264) {
                        winsX = true;
                    } else if (sumV == 237) {
                        winsO = true;
                    }
                }
            }
            //diagonal check
            int leftDiagonal = array[0][0] + array[1][1] + array[2][2];
            int rightDiagonal = array[0][2] + array[1][1] + array[2][0];

            if (leftDiagonal == 264 || rightDiagonal == 264) {
                winsX = true;
            } else if (leftDiagonal == 237 || rightDiagonal == 237) {
                winsO = true;
            }
            //checking all possible states
             if (winsX == false && winsO == false && m == 8) {
                System.out.println("Draw");
                break;
            } else if (winsX == true && winsO == false) {
                System.out.println("X wins");
                break;
            } else if (winsX == false && winsO == true) {
                System.out.println("O wins");
                break;
             }
        }
    }
}


