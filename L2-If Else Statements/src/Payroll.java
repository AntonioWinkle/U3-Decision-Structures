import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

import javax.swing.*;
import java.text.DecimalFormat;

public class Payroll {

    /*
    This program should calculate an employee's pay
    which includes overtime pay.

    Overtime pay is any hours over 40 gets a wage equal
    to 1.5 times base wage.

    BASE WAGE: 12.50
    OVERTIME WAGE: 18.75

    HOURS WORKED: 50
    HOURS: 40 NORMAl, 10 OVERTIME
    PAY: 40 * 12.50 + 10 * 18.75 = 687.50

    Let's output this in proper currency form.
     */

    public static void main(String[] args) {

        double rate = input("What is your hourly rate? ");
        double hours = input("How many hours did you work? ");

        if(hours > 40){
            output(overtimeWage(hours, rate));
        }else{
            output(normalWage(hours, rate));
        }

    }

    public static double normalWage(double hours, double wage){
        return hours * wage;
    }

    public static double overtimeWage(double hours, double wage){

        double overtime = hours - 40;

        return (40 * wage) + (overtime * (wage * 1.5));

    }

    public static double input(String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));

    }

    public static void output(double wage){

        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "You earned " + round.format(wage));

    }
}
