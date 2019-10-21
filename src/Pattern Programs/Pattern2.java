import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i)
                    System.out.print("* ");
                else
                    System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
