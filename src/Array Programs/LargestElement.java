public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {15, 47, 12, 19, 88, 22};
        int largest = 0;

        for (int i : arr) {
            if (largest < i)
                largest = i;
        }

        System.out.println("Largest element = " + largest);

    }
}