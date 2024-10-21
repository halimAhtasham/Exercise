package ThirdPackage;
import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello world!");
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter number a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter number b: "));

        double result = a + b;
        String msg = "The result is " + result;
        JOptionPane.showMessageDialog(null, msg);
    }
}
