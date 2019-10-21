public class ArrayCopy {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Orignal Array");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("\nCopy of Array");

        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}