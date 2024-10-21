package FirstPackage;

public class Calc {
    public double n, r;
    public Calc(){
        n =1.0;
        r = 1.0;
    }


    public long fact(double x) {

        long result = 1L;
        if(x < 0) return 0L;
        if (x == 0 || x==1) return 1L;
        for (int i = 2; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public double nPr() {
        if (n >= r && r >= 0) {
            return (double) ((fact(n)) / (fact(n - r)));
        } else {
            System.out.println("Ensure: n >= r >= 0");
            return 0;
        }
    }

    public double nCr() {
        if (n >= r && r >= 0) {
            return (double) ((fact(n)) / ((fact(r)) * (fact(n - r))));
        } else {
            System.out.println("Ensure: n >= r >= 0");
            return 0;
        }
    }
}
