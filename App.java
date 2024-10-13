import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        // double [] b = new double [10];
        int [] myArray = {10, 20, 30, 40, 50, 60,  70, 80, 90, 100};
        int [] yourArray = new int [10];

        System.arraycopy(myArray, 0, yourArray, 0, 10);
        /*  for (int i : yourArray) {
            System.out.println(i);
        }*/
        /*
            for (int i = 0; i < yourArray.length; i++) {
            System.out.println(yourArray[i]);
        }
         */
        

        int [] myNewArray = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] yourNewArray = Arrays.copyOfRange(myNewArray, 0,10);
        Arrays.sort(yourNewArray);
        for(int i : yourNewArray){
            System.out.println(i);
        }

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}