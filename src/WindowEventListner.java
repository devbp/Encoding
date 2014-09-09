import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;



public class WindowEventListner {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	
	public void prepareGUI(){
		mainFrame= new JFrame("Java SWING Examples");
		
		mainFrame.setSize(400, 400);
		
		headerLabel= new JLabel(" hello", JLabel.CENTER);
		statusLabel= new JLabel("hi ", JLabel.CENTER);
		controlPanel= new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
		
		
		
		
	}
	
	
	
}
