package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String vote = JOptionPane.showInputDialog("How old are you?");
		int voteAsInt = Integer.parseInt(vote);	
		if(voteAsInt >=18) {
			JOptionPane.showInputDialog("Who should the next president be?");
			JOptionPane.showMessageDialog(null, "Thank you!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Ur to young, nobody cares what they think");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
