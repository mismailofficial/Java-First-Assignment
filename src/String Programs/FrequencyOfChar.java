import javax.print.DocFlavor;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "Pakistan Zindabad";
        int[] freq = new int[str.length()];
        char[] charStr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i+1; j < str.length(); j++) {
                if (charStr[i] == charStr[j]) {
                    charStr[j] = '0';
                    freq[i]++;
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (charStr[i] != '0' && charStr[i] != ' ')
                System.out.println(charStr[i] + " - " + freq[i]);
        }

    }
}