import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */

    public class Prom {

        /* In order to purchase a ticket to go to prom,
        you must be a Junior or Senior, have no disciplinary
        records and have $40 to pay for it.
         */
        public static void main(String[] args) {

            int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What is your grade level? (9,10,11,12)"));
            int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had? "));
            int money = Integer.parseInt(JOptionPane.showInputDialog("How much money, rounded down to the nearest $5, do you have? "));

            if (gradeLevel >= 11) {
                if (discipline >= 1) {
                    JOptionPane.showMessageDialog(null, "You can't get the ticket. ");
                }else {

                    if(money >= 40){
                        JOptionPane.showMessageDialog(null, "You can get a ticket! ");
                    }else{
                        JOptionPane.showMessageDialog(null, "You can't get the ticket. ");
                    }
                }
            }else {
                JOptionPane.showMessageDialog(null, "You can't get the ticket. ");
            }
        }






    }

}
