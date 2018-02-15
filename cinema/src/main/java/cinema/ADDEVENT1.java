package cinema;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ADDEVENT1 implements ActionListener
{
	JButton BTN;
	
	
	
	
	
	public ADDEVENT1(JButton bb)
	{
		
		BTN = bb;
		
	}

	public void actionPerformed(ActionEvent e) 
	{
	      JButton btn = (JButton) e.getSource();

	      if(btn == BTN)
	      {
	    	
	      }
		
	}

}
