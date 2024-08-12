//Event Handling In Java 
import java.awt.*;
import java.awt.event.*;
class AEvents extends Frame implements ActionListener 
{
	TextField tf;
	AEvents()
	{
		//Create Components
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click Me");
		b.setBounds(100,120,80,30);
		//Register Listener
		b.addActionListener(this);//this show here current object 
		//Add components on Frame 
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent e)
	   {
		tf.setText("Welcome");
	     }
    
	//Main method
  public static void main(String args[])
  {
  	 new AEvents();
  }
}