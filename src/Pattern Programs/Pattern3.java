import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
