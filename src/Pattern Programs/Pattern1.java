public class Pattern1 {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            for (int j=i; j<=i*i; j+=i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
