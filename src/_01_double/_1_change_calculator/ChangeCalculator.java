package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int numNickels = Integer.parseInt(nickels); 
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
		int numDimes = Integer.parseInt(dimes); 
		// Ask the user how many quarters they have, and convert their answer
		String quarters  = JOptionPane.showInputDialog("how many quarters do you have?");
		 int numQuarters = Integer.parseInt(quarters); 
		// Calculate how much money the user has.  Hint: Use a double variable 
		 double nickelMoney = numNickels*0.05;
		 System.out.println(nickelMoney);
		 double dimeMoney = numDimes*0.10;
		 System.out.println(dimeMoney);
		 double quarterMoney = numQuarters*0.25;
		 System.out.println(quarterMoney);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		 System.out.println(nickelMoney + dimeMoney + quarterMoney);
	}
}

