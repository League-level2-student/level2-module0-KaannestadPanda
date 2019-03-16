/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame frame;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String num=JOptionPane.showInputDialog("Positive num");
		int i = Integer.parseInt(num);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons= new JButton[i];
	
		//5. Make a for loop to iterate through the JButton array
		for(int g = 0; g<i; g++) {
			
			//6. initialize each JButton in the array
			buttons[g]=new JButton();
			//7. add the ActionListener to each JButton
			buttons[g].addActionListener(this);
			//8. add each JButton to the panel
			panel.add(buttons[g]);
		
		}
		//9 add the panel to the window
		frame.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		//11. set the JFrame to visible.
		frame.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the button or u be a dum dum");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		Random ran=new Random();
		int u = ran.nextInt(i);
		hiddenButton = u;
		//14. Set the text of the JButton located at hiddenButton the read "ME"
buttons[hiddenButton].setText("ye");
		//15. Use Thread.sleep(100); to pause the program.
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//    Surround it with a try/catch
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "Win");
		}
		else {
			JOptionPane.showMessageDialog(null, "u fail");
		}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
