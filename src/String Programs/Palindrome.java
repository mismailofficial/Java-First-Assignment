import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a,b = "";


            System.out.print("Enter the String you want to check: ");
            a = input.nextLine();
            a = a.replaceAll("\\s","");
            b = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                b += a.charAt(i);
            }
            if (a.equalsIgnoreCase(b))
                System.out.println("The string is palindrome");
            else
                System.out.println("The string is not palindrome");


    }
}
