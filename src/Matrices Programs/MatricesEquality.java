
import java.util.Scanner;

public class MatricesEquality {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rows1, rows2 ,column1, column2, flag = 1;

        System.out.println("Enter the order of the first matrix:");
        System.out.print("Rows: ");
        rows1 = input.nextInt();
        System.out.print("Columns: ");
        column1 = input.nextInt();
        int[][] mat1 = new int[rows1][column1];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter first matrix[" + i + "][" + j + "]: ");
                mat1[i][j] = input.nextInt();
            }

        System.out.println("Enter the order of the second matrix:");
        System.out.print("Rows: ");
        rows2 = input.nextInt();
        System.out.print("Columns: ");
        column2 = input.nextInt();
        int[][] mat2 = new int[rows2][column2];
        for (int i = 0; i < rows2; i++)
            for (int j = 0; j < column2; j++) {
                System.out.print("Enter second matrix[" + i + "][" + j + "]: ");
                mat2[i][j] = input.nextInt();
            }

        if (rows1 != rows2 && column1 != column2)
            System.out.println("Matrices are not equal");
        else {
            check: for (int i = 0; i < rows1; i++)
                for (int j = 0; j < column1; j++)
                    if (mat1[i][j] != mat2[i][j]) {
                        flag = 0;
                        break check;
                    }
            if (flag == 1)
                System.out.println("Matrices are Equal");
            else
                System.out.println("Matrices are not Equal");
        }
    }
}