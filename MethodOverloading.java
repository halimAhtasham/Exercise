public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 30));
        System.out.println(cal.add(10.3, 20.8, 30.90));
        System.out.println(cal.add(10.3, 20.70));
    }
}

class Calculator {

    public int add(int i , int j){
        return i+j;
    }
    public int add(int i , int j, int k){
        return i+j+k;
    }
    public double add(double i , double j, double k){
        return i+j+k;
    }
    public double add(double i , double j){
        return i+j;
    }



}
