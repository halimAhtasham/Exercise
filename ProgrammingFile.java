package FirstPackage;


import java.util.Scanner;

public class ProgrammingFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc cal;
        cal = new Calc();

        System.out.println("Enter n: ");
        cal.n = input.nextDouble();
        System.out.println("Enter r: ");
        cal.r = input.nextDouble();
        System.out.println("Enter x: ");
        long x = input.nextLong();
        long factorial = cal.fact(x);


        double npr = cal.nPr();
        double ncr = cal.nCr();
        String msg = "Factorial: " + factorial + "\nPermutation: " + npr + "\nCombination: " + ncr;
        System.out.println(msg);
    }
}
