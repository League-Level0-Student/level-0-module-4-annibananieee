package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("whats your test score");
		double testScore = Double.parseDouble(input); 
			boolean passedExam;
			if(testScore<70) {
				passedExam = true;
				}
			else { 
				passedExam = false;
			}
		if(passedExam = true) {
			JOptionPane.showMessageDialog(null, "wow u mustve studied rly hard");
		}
		if(passedExam = false) {
			JOptionPane.showMessageDialog(null,"sux. sry try harder next time ig");
		}
	}
}