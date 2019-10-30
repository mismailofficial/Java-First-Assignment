import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("input second number: ");
        int num2 = scanner.nextInt();

        float result = multiply(num1,num2);
        System.out.println("multiplication: " + result);
        result = TestException.div(num1,num2);
        System.out.println("division: " + result);
    }

    static float multiply(int num1, int num2) {
        return num1*num2;
    }

    static float div(int num1, int num2) {
        try {
            return num1/num2;
        } catch (ArithmeticException ae) {
            System.out.println("Division is not possible by 0");
            return 0;
        }
    }
}
