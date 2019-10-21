import java.util.Scanner;

public class MatrixAddition {
    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int row, column;
        System.out.print("Enter the order of the matrix: \nrow = ");
        row = input.nextInt();
        System.out.print("column = ");
        column = input.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] result = new int[row][column];
        System.out.println("Enter the first matrix elements: ");
        for (int i=0; i<row; i++)
            for (int j=0; j<column; j++)
                matrix1[i][j] = input.nextInt();

        System.out.println("Enter the second matrix elements: ");
        for (int i=0; i<row; i++)
            for (int j=0; j<column; j++)
                matrix2[i][j] = input.nextInt();

        for (int i=0; i<row; i++)
            for (int j=0; j<column; j++)
                result[i][j] = matrix1[i][j] + matrix2[i][j];

        System.out.print("The result matrix is: ");
        for (int i=0; i<row; i++) {
            System.out.println();
            for (int j=0; j<column; j++)
                System.out.print(result[i][j] + " ");
        }

    }
}
