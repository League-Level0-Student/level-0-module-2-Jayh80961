//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i=0;i< 10;i++) {
			Random randomMaker = new Random();
			
			int randomNumber = randomMaker.nextInt(5);
			
			System.out.println(randomNumber);
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You are the smartest in the world");
		}
		if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are very athletic");
		}
		if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You will rule the world tommorow");
		}
		if(randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are the most trustable person in the world");
		}
		if(randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are a brave person");
		}
		if(randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You are good at cooking");
		}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
