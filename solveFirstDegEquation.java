//Actually solve first degree equationS but i was too lazy

import javax.swing.JOptionPane;

public class solveFirstDegEquation {
    public static void main(String[] args){
        Double a11 , a12, a21, a22, b1, b2;
        // String a11, a12, a21, a22, b1, b2;
        JOptionPane.showMessageDialog(null, "I can help you solve a system of 2 linear equations, \n which has a form of \n a11*x + a12*y = b1 \n a21*x + a22*y = b2 ", null, 0);
        a11 =Double.parseDouble(JOptionPane.showInputDialog("Please enter a11"));
        a12 =Double.parseDouble(JOptionPane.showInputDialog("Please enter a12"));
        b1 =Double.parseDouble(JOptionPane.showInputDialog("Please enter b1"));
        a21 =Double.parseDouble(JOptionPane.showInputDialog("Please enter a21"));
        a22 =Double.parseDouble(JOptionPane.showInputDialog("Please enter a22"));
        b2 =Double.parseDouble(JOptionPane.showInputDialog("Please enter b2"));
        System.exit(0);
    }
}
