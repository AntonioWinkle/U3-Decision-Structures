import javax.swing.*;
public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.

    have use input 2 numbers, have methods utilize the input, return the data and show message
     */

    public static void main(String[] args) {
        double numOne = Double.parseDouble(JOptionPane.showInputDialog("What is the first number?"));
        double numTwo = Double.parseDouble(JOptionPane.showInputDialog("What is the second number?"));

        if(numOne > numTwo){
            JOptionPane.showMessageDialog(null,multiply(numOne, numTwo));
        }
        if(numOne <= numTwo){
            JOptionPane.showMessageDialog(null,add(numOne, numTwo));
        }

    }


    public static double add(double numOne, double numTwo){
        return numOne + numTwo;
    }

    public static double multiply(double numOne, double numTwo){
        return numOne * numTwo;
    }
}