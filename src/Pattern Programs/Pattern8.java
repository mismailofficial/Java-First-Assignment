public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i*j > 2 && i+j > 4)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            for (int k = 4; k > 0; k--) {
                if (i*k > 2 && i+k > 4)
                    System.out.print("*");
                else
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}