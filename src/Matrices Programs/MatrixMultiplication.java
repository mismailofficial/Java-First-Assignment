public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] mat1 = {
                {1,2,3,4},
                {4,3,4,1}
        };
        int[][] mat2 = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };
        int[][] result = new int[mat1.length][mat2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < mat2.length; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int[] i : result) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
