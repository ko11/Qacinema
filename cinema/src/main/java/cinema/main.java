package cinema;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main 
{

	public static void main(String[] args) 
	{
		
		
		//logic x = new logic();
		
		//x.doCalculations();
	
	//	prices t = new prices();
	//	t.tickets(a,b);
		
		
	
			    
			    
			    JFrame J1 = new JFrame ("Cinema");
			    
			    
			    Panel P1 = new Panel();			
			    Panel P2 = new Panel();		
			    Panel P3 = new Panel();			


			    Label L1 = new Label ("Please enter your age(s)");
			    TextField T1 = new TextField(20);
			    TextField T2 = new TextField(20);
			    Label L2 = new Label ("Ticket Price:");
			    Button b = new Button("Go");
			    JButton bb = new JButton("Book");

			    TextField T3 = new TextField(20);
			    Button b1 = new Button("Add");

			    
			
				J1.setSize(600, 400);
				J1.setVisible(true);

	
			    ADDEVENT E = new ADDEVENT(T1, T2, b);
				b.addActionListener(E);
				
				ADDEVENT1 F = new ADDEVENT1(bb);
				bb.addActionListener(E);
				
				ADDEVENT G = new ADDEVENT(T3, b1);
				b1.addActionListener(E);

			    		
			    		
				P1.add(L1);		
			    P1.add(T1);
			    P1.add(b);
			    P2.add(L2);  
			    P2.add(T2);
			    P2.add(bb);
			  
			    P3.add(T3);
			    P3.add(b1);
			    
			    		
			    J1.add(P1, BorderLayout.NORTH);
			    J1.add(P2, BorderLayout.SOUTH);
			    J1.add(P3, BorderLayout.CENTER);
	}
}

