

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;





public class Container extends JFrame
{
  
	public Container ()
        {
		this.add(new DrawPanel());
                
                this.setTitle("Animacao Simples");
                
                
		setSize(1024,728);
                
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
		setLocationRelativeTo(null);
                
		this.setResizable(false);
                
		setVisible(true);
	}
             
	public static void main (String [] args)
        {
		new Container();
	}// main
    
	
  
}//class Container
