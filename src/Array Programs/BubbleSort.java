public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 5, 1, 2, 9, 7, 8};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array in ascending order: ");
        for (int i : arr)
            System.out.print(i + " ");
    }
}