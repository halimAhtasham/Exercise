import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int temp, remainder, sum = 0;
        temp = number;
        while (temp > 0) {
            remainder = temp % 10;
            // if (remainder == 3) {
            //     count++;
            // }
            sum = sum * 10 + remainder;  // 123%10 == 3 || 0 + 3*10 = 30 || 12%10 = 2|| 30+2*10
            temp = temp / 10;
        }
        System.out.println(sum);
        input.close();
    }
}
