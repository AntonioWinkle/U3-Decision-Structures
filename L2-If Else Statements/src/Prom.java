import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */


    public static void main(String[] args) {

        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What grade level are you in (9, 10 , 11 , 10: "));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had: "));
        int money = Integer.parseInt(JOptionPane.showInputDialog("About how much money do you have? Round down to the nearest 5$"));

        if(gradeLevel >= 11){

            if(discipline >= 1){

                System.out.println("You can't go to Prom. That's ok, you can't get stood up at Prom either.");

            }else{

                if(money >= 40){
                    System.out.println("You can get a Prom ticket.");
                }else{
                    System.out.println("You can't go to Prom. That's ok, you can't get stood up at Prom either.");
                }
            }
        }else{
            System.out.println("You can't go to Prom. That's ok, you can't get stood up at Prom either.");
        }
    }
}
