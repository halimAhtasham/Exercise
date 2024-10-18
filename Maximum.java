import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Give three number: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int initialMax = Math.max(a, b);
        int finalMax = Math.max(c, initialMax);

        System.out.println(finalMax);
        input.close();
    }
}
