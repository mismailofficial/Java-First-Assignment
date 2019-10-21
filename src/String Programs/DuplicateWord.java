import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] ags) {
        
        Scanner input = new Scanner(System.in);
        String string = "Big black bug bit a big black dog on his big black nose";
        int count;
        string = string.toLowerCase();
        
        String[] word = string.split(" ");
        
        System.out.println("Duplicate words in a given string: ");
        for (int i = 0; i < word.length; i++) {
            count = 1;
            for (int j = i+1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    word[j] = "";
                }
            }
            if (word[i] != "")
                System.out.println(word[i] + " - " + count);
        }
    }
}
