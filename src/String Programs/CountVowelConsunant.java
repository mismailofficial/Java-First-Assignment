public class CountVowelConsunant {
    public static void main(String[] args) {

        //Counter variables to store the count of vowel and consunant
        int vCount = 0, cCount = 0;

        //Declaring a string
        String str = "This is really a simple sentence";

        //Converting entire string to lower case
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of Consunent: " + cCount);
    }
}
