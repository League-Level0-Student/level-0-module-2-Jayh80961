//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int Random = new Random().nextInt(4);
	// 3. Print out this variable
	JOptionPane.showMessageDialog(null, Random);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Enter a yes or no question for the 8 ball");
	// 5. If the random number is 0
	if (Random == 0){
		JOptionPane.showMessageDialog(null, "Yes");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1
	else if(Random == 1){
		JOptionPane.showMessageDialog(null, "No");
	}
	// -- tell the user "No"

	// 7. If the random number is 2
	else if(Random == 2){
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
	else if(Random == 3){
		JOptionPane.showMessageDialog(null, "This question cannot be answered lolololol");
	}
	// -- write your own answer
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
