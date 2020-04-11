//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._1_intro_to_random;

import java.util.Random;

import javax.swing.JOptionPane;

public class IntroToRandom {
	public static void main(String[] args) {
		
		Random num = new Random();
		
		//3   Now to make num random. 
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		
		//3b. Next, set the value of num, using .nextInt() to get a random number from the Random object
		int number = num.nextInt(101);

		//4. Now limit the value of num to be between 0 and 100

		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		//int number = num.nextInt(75);
		//6. Challenge: Limit the value of num to be between -222 and 88

		//1. Print out the value of num
		System.out.println(number);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
