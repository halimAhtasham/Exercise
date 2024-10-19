package SecondPackage;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cal cal1 = new Cal();

        System.out.println("Enter a: ");
        cal1.a = input.nextDouble();
        System.out.println("Enter b: ");
        cal1.b = input.nextDouble();

        double addition = cal1.add();
        double subtraction = cal1.subtract();
        double multiplication = cal1.multiply();
        double division = cal1.divide();
        double modulus = cal1.modulus();

        String msg = "Addition: " + addition + "\nSubtraction: " + subtraction + "\nMultiplication: " + multiplication + "\nDivision: " + division + "\nModulus: " + modulus;
        System.out.println(msg);
    }
}
