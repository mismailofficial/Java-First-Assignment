import java.util.Scanner;

public class LowerTriMat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row, column;
        System.out.print("Enter rows of matrix: ");
        row = input.nextInt();
        System.out.print("Enter coloumns of matrix: ");
        column = input.nextInt();
        int[][] mat = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("matrix [" + i + "][" + j + "]: ");
                mat[i][j] = input.nextInt();
            }
        }
        if (row != column)
            System.out.println("Matrix should be a square matrix");
        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if(j > i)
                        System.out.print("0 ");
                    else
                        System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}