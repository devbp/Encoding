
 import java.awt.Frame;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
 
public class MyGUI  extends JFrame implements ActionListener {
JPanel mypanel;
JButton mybutton,convertbutton;
JLabel mylabel;
public  String selectedfilename;
	public MyGUI (){
		JFrame guiFrame= new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300,250);
        guiFrame.setVisible(true);
        
        mypanel=new JPanel();
        mypanel.setVisible(true);
        convertbutton= new JButton("Convert File");
        mybutton= new JButton("Browse File");
        mybutton.addActionListener(this);
        //convertbutton.addActionListener(this);
        //convertbutton.addMouseListener();
        mylabel= new JLabel();
    
        mypanel.add(mybutton);
        mypanel.add(convertbutton);
        mypanel.add(mylabel);
        guiFrame.add(mypanel);
    
	}
	
	public void actionPerformed (ActionEvent event)
	{
		JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        selectedfilename = f.getName();
       // System.out.println("You have chosen: " + filename);
		mylabel.setText("Button clicked"+selectedfilename);
		
		ReadingFile r= new ReadingFile();
		try {
			r.Read(selectedfilename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}//end of the class
