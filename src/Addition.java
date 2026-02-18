import java.util.Scanner;

public class Addition {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Answer = " + result);
    }
}
