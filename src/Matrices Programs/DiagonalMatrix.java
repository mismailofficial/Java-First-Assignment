import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row, column, flag = 1;

        System.out.println("Enter the order of the first matrix:");
        System.out.print("Rows: ");
        row = input.nextInt();
        System.out.print("Columns: ");
        column = input.nextInt();
        int[][] mat = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                System.out.print("Enter first matrix[" + i + "][" + j + "]: ");
                mat[i][j] = input.nextInt();
            }

        //row = mat.length;
        //column = mat[0].length;

        if (row != column)
            System.out.println("This matrix is not diagonal matrix");
        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (i != j) {
                        if (mat[i][j] != 0)
                            flag = 0;
                    }
                }
            }
            if (flag == 1)
                System.out.println("This matrix is diagonal matrix");
            else
                System.out.println("This matrix is not diagonal matrix");
        }
    }
}