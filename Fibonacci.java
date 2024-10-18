import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;

        int fibonacci = 0;

        // 0 1 1 2 3 5 8
        if (n == 0) {
            System.out.println(first);
        }
        else if (n == 1) {
            System.out.println(second);
        }
        else {

            for (int i = 2; i <= n; i++) {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
            }
            // System.out.println(fibonacci);
            System.out.println(fibonacci);
        }
        input.close();
    }
}
