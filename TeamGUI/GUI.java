import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI {
	public static void main(String args[]) {
		//creates a window to contain everything
		JFrame window = new JFrame();
		window.setLocation(50, 50);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a filechooser
		JFileChooser fileChooser = new JFileChooser();
		
		//Add everything to a panel
		JPanel panel = new JPanel();
		window.getContentPane().add(panel);
		panel.add(fileChooser);
		
		//Pack everything, and show it
		window.pack();
		window.setVisible(true);
		
	}
}
