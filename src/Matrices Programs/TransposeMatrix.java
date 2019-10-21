public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int[][] transpose = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        System.out.println("The transpose of the given matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}