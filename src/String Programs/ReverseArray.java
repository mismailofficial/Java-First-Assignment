import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};

        System.out.println("Original Array");
        for (int i:
             arr1) {
            System.out.print(i+", ");
        }
        System.out.println("\nReverse Array");
        for (int i=arr1.length-1; i >= 0; i--) System.out.print(arr1[i]+", ");
    }
}
