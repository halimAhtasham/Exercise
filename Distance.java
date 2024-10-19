package FourthPackage;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, d, distance, X, Y;
        System.out.print("Enter x1, y1, x2, y2: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        X = Math.abs(x1 - x2);
        Y = Math.abs(y1 - y2);
        d = Math.pow(X, 2) + Math.pow(Y, 2);
        distance = Math.sqrt(d);
        System.out.printf("Distance between two points is: %.2f",distance);
    }
}
