package automata;

import javax.swing.JOptionPane;

public class MachineProblem1 {

    public static void main(String[] args) {
    	
    	//Declare Variables
    	int dividend, divisor, GCD = 0, LCM;
    	
        String windowTitle = "AUTOMATA - Machine Problem 1";
        JOptionPane.showMessageDialog(null, "Euclidean Algorithm Simulator", windowTitle, JOptionPane.INFORMATION_MESSAGE);
        int first_num = 0;
        int second_num = 0;
        
      //Implement try-catch and while loop to avoid zero inputs
        while (first_num == 0 || first_num < 0) {
            String input = JOptionPane.showInputDialog(null, "Input first number (must not be zero or negative): ", windowTitle, JOptionPane.QUESTION_MESSAGE);
            if (input == null) { // check if user clicked "Cancel"
            	JOptionPane.showMessageDialog(null, "Thank you for using the program!", windowTitle, JOptionPane.CLOSED_OPTION);
                System.exit(0); // terminate program
            }
            try {
                first_num = Integer.parseInt(input);
                if (first_num == 0 || first_num < 0) {
                    JOptionPane.showMessageDialog(null, "First number cannot be zero or a negative. Please try again.", windowTitle, JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", windowTitle, JOptionPane.ERROR_MESSAGE);
            }
        }

        while (second_num == 0 || second_num < 0) {
            String input = JOptionPane.showInputDialog(null, "Input second number (must not be zero or negative): ", windowTitle, JOptionPane.QUESTION_MESSAGE);
            if (input == null) { // check if user clicked "Cancel"
            	JOptionPane.showMessageDialog(null, "Thank you for using the program!", windowTitle, JOptionPane.CLOSED_OPTION);
                System.exit(0); // terminate program
            }
            try {
                second_num = Integer.parseInt(input);
                if (second_num == 0 || second_num < 0) {
                    JOptionPane.showMessageDialog(null, "Second number cannot be zero or a negative. Please try again.", windowTitle, JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", windowTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        //Compare First and Second Number
        if (first_num > second_num) {
            dividend = first_num;
            divisor = second_num;
        } else {
            dividend = second_num;
            divisor = first_num;
        }
        
        //Display Dividend and Divisor
        JOptionPane.showMessageDialog(null, "Dividend: " + dividend + "\n" + "Divisor: " + divisor, windowTitle, JOptionPane.INFORMATION_MESSAGE);

        
        //Perform Euclidean Algorithm and Display Solution
        String message = "";
        if (divisor == 0) {
            GCD = dividend;
        } else {
            int k, l;
            do {
                k = dividend % divisor;
                l = dividend / divisor;
                message += dividend + "/" + divisor + " = " + l + ", remainder " + k + "\n";
                dividend = divisor;
                divisor = k;
            } while (k != 0);
            GCD = dividend;
            JOptionPane.showMessageDialog(null, message, "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //Compute LCM
        LCM = Math.abs(first_num * second_num) / GCD;
        
        //Display final results
        JOptionPane.showMessageDialog(null, "GCD: " + GCD + "\nLCM: " + first_num + " * " + second_num + "/" + GCD + " = " + LCM, windowTitle, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Thank you for using the program!", windowTitle, JOptionPane.CLOSED_OPTION);

    }
}
