public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println("Original Array: ");
        for (int i : arr1) {
            System.out.print( i + " ");
        }

        System.out.println("\nReversed Array: ");
        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.print( arr1[i] + " ");
        }
    }

}