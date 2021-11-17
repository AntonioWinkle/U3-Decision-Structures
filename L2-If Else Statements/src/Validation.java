import javax.swing.*;

public class Validation {

    /*
    Let's create a simple program that validates
    a user's input.

    Let's say a user must enter a number greater than 10.
     */


    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number greater than 10: "));

        if(number > 10){
            JOptionPane.showMessageDialog(null,"You did it!! You may continue.");
        }else{
            JOptionPane.showMessageDialog(null, "That number is not greater than 10. You failed. Get a Life.");
        }

    }


}
