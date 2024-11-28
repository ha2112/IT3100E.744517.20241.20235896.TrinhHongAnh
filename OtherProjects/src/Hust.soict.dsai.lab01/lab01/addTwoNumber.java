package Hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class addTwoNumber {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
                "PLease input the first number", 
                "Input the first number", 
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
                "PLease input the second number", 
                "Input the second number", 
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double num3 = num1 + num2;
        String total = String.valueOf(num3);
        JOptionPane.showMessageDialog(null, "The sum of the two numbers you just input is " + total, "The total value", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
