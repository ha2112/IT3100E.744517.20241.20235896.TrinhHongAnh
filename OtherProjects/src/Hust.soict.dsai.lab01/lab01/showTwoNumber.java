package Hust.soict.dsai.lab01;
//Example 5: showTwoNumber.java

import javax.swing.JOptionPane;

public class showTwoNumber{
    public static void main(String[] args){
        String strNum1, strNum2;
        String Notification = "You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, 
                "PLease input the first number", 
                "Input the first number", 
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
                "PLease input the second number", 
                "Input the second number", 
                JOptionPane.INFORMATION_MESSAGE);
        Notification += strNum1 + " and " + strNum2;
        JOptionPane.showMessageDialog(null, 
                Notification, 
                "Show two numbers", 
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}