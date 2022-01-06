package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	 static /*
     * 5. Create your own exception by making a new class called
     * NegativeNumberException that extends Exception.
     * 
     * 6. Add a method to your exception called scaryPopup that creates a
     * JOptionPane Message Dialog telling the user they have triggered a
     * critical error in their computer.
     */
 void scaryPopup() {
	 JOptionPane.showMessageDialog(null, "Error 101: you have caused a critical error in your computer");
 }
 static void testPositive(int i) throws NegativeNumberException {
	 if(i<=0) {
		 throw new NegativeNumberException();
	 }
 }
 public static void main(String[] args) {
	try {
		testPositive(-32);
	} catch (NegativeNumberException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		scaryPopup();
	}	
	finally {
		JOptionPane.showMessageDialog(null, "Computer is fine");
	}
}
    /*
     * 7. Create a static method in this class called testPositive. It should
     * take a single number as a parameter and throw a NegativeNumberException
     * if that number is negative.
     * 
     * 8. Call the testPositive method with a negative number inside of a the
     * main method. Make sure your catch block can catch a
     * NegativeNumberException.
     * 
     * Note: You can add multiple catch blocks that each catch a unique
     * Exception.
     * 
     * The top Exception should be the most specific and the bottom should be
     * the most general like when using if/else statements.
     * 
     * In this case, NegativeNumberException is the most specific one since it
     * extends from Exception which is capable of catching any exception.
     * 
     * 9. When the NegativeNumberException is caught, use the caught exception
     * to call your scaryPopup method.
     * 
     * 10. Try running the program. Did it show a pop-up?
     */

    /*
     * 11. Add a finally block after your catch block(Hint: finally{}). A
     * finally block always occurs after a try/catch block even if no exception
     * occurs.
     * 
     * 12. In your finally block create a JoptionPane Message Dialog that
     * assures the user their computer is okay.
     * 
     * 13. Try running the program with values that both throw and don't throw
     * exceptions.
     */
}
