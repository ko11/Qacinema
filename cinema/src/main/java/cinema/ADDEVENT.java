package cinema;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADDEVENT  implements ActionListener 

{
	TextField T1;
	TextField T2;

	Button BTN;
	
	TextField T3;
	Button BTN1;

	
	public ADDEVENT(TextField t1, TextField t2, Button b) 
	{
		T1 = t1; 
		T2 = t2; 
		BTN = b;
	}


	public ADDEVENT(TextField t3, Button b1) 
	{
		T3 = t3; 
		BTN1 = b1;
	}


	public void actionPerformed(ActionEvent e) 
	
	{
		Button go = (Button)e.getSource();
		int A;
		
		A = Integer.parseInt(T1.getText());

		if(A >= 16 && A < 70) 
		{
			switch(A) 
			{
			case 1:;
				break;
			}
		T2.setText("£8");

		}
		else if(A >= 70)
		{
			switch(A)
			{
			case 2:
				break;			
		}			
			T2.setText("£6");
		}
		if (A < 16)
		{
			switch(A)
			{
			case 3:
				break;		
		}
			T2.setText("£6");
		}
	}
	
	
	
	public void actionPerformed1(ActionEvent f) 
	{
		Button add = (Button)f.getSource();
		
	      if(add == BTN1)
	      {
				T2.setText("dfgnf");
	      }

		
	}
}
