# Euclidean_Algorithm
 
This is a Java program that simulates the Euclidean algorithm for finding the greatest common divisor (GCD) and the least common multiple (LCM) of two integers inputted by the user through a graphical user interface (GUI).

The program starts by importing the JOptionPane class, which allows it to display dialog boxes for input and output.

Next, it declares variables for the dividend, divisor, GCD, LCM, and windowTitle. It also initializes the first_num and second_num variables to 0.

The program then displays an information message dialog box to the user to introduce the program.

The program then prompts the user to input the first and second number, with input validation implemented through a while loop and try-catch block to ensure that the inputted values are valid integers that are not zero or negative. If the user cancels the input, the program displays a thank you message and terminates.

After input validation, the program compares the first_num and second_num variables and assigns them to the dividend and divisor variables accordingly.

The program then displays the values of the dividend and divisor in an information message dialog box.

Next, the program implements the Euclidean algorithm by repeatedly dividing the dividend by the divisor and finding the remainder until the remainder is 0. The program also displays the steps of the algorithm in each iteration in a message string. After the algorithm finishes, the GCD is assigned to the GCD variable.

Finally, the program calculates the LCM by dividing the product of the first_num and second_num by the GCD, and displays the GCD and LCM in an information message dialog box, along with a thank you message before terminating the program.
