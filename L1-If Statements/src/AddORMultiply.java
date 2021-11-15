import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("What is your first number?"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("What is your second number?"));

        add();
        multiply();

    }

    public static double add(double num1, double num2){
        return if (num1 < num2){
            double num1 + num2;
            JOptionPane.showMessageDialog(null,"The sum is: " + sum);
        }
    }

    public static void multiply(double num1, double num2){
         if (num1 > num2){
            double product num1 * num2;
            JOptionPane.showMessageDialog(null,"The product is: " + product);
        }
    }
}