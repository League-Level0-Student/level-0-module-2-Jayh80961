package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers{
	public static void main(String[] args) {
		Random random = new Random();
		int Random = random.nextInt(51);
			JOptionPane.showMessageDialog(null, Random);
		Random bob1 = new Random();
		int bob = bob1.nextInt(51);
			JOptionPane.showMessageDialog(null, bob);	
		Random jeff1 = new Random();
		int jeff = jeff1.nextInt(51);
			JOptionPane.showMessageDialog(null, jeff);
		Random hi1 = new Random();
		int hi = hi1.nextInt(51);
			JOptionPane.showMessageDialog(null, hi);
		Random luck1 = new Random();
		int luck = luck1.nextInt(51);
			JOptionPane.showMessageDialog(null, luck);
		Random ok1 = new Random();
		int ok = ok1.nextInt(51);
			JOptionPane.showMessageDialog(null, ok);
		


	
	
	
	
	}
	
}
