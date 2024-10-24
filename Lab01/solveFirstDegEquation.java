package Lab01;
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
        Double x, y;
        Double delta = a11*b2 - a21*b1;
        if (delta == 0){
            JOptionPane.showMessageDialog(null, "Wrong", null, 0);
            System.exit(0);
        }
        x = (b1*a22 - b2*a12) / (a11*a22 - a21*a12);
        y = (a11*b2 - a21*b1) / (a11*a22 - a21*a12);
        String valueofx = String.valueOf(x), valueofy = String.valueOf(y);
        JOptionPane.showMessageDialog(null, "x = " + valueofx + "\ny = " + valueofy, "Answers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
