import javax.swing.*;

class Compute extends Methods {
     public static int computedamage(String value1, String value2) {
         int val1 = Integer.parseInt(value1);
         int val2 = Integer.parseInt(value2);
         int finaldamage = val1 + val2;
         return finaldamage;

     }

     public static void displayMessage(String finaldamage){
         JOptionPane.showMessageDialog( null, "Your full damage is: " + finaldamage, "Result" , JOptionPane.INFORMATION_MESSAGE );
     }
 }
