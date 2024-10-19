package FourthPackage;

import java.util.Scanner;

public class AreaHarenFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, a, b, c,  perimeter, area;

        System.out.println("Enter three side of the triangle: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        perimeter = 2 * (a + b + c);
        s = perimeter / 2;
        double equation = (s * (s - a) * (s - b) * (s - c));
        area = Math.sqrt(equation);
        System.out.printf("The area of the triangle using Haren's Formula: %.3f",area);
    }
}
