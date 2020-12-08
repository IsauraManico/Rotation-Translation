
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;
import javax.swing.Timer;



/**
 *
 * @author isaura
 */
public class DrawPanel extends JPanel implements ActionListener
{
    
    private Timer tempo;
    private Objects obj1;
    private Objects obj2;
    
    private int a= 3;
    
     private int ang = 10;
        
     private int vel = 0;
    
    public DrawPanel()
    {
        
        setFocusable(true);
        setDoubleBuffered(true);
		
        tempo = new Timer(10,this);
        tempo.start();
        
                obj1 = new Objects(100, 200, 50, 50);
                obj1.load();
                
                obj2 = new Objects(100,200,60,60);
                obj2.load();
		
        this.setBackground(Color.gray);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D graficos = (Graphics2D) g;
        
        
           graficos.translate(a, 0);
                        graficos.setColor(Color.red);
                        graficos.drawString("ISAURA MANICO", 100, 400);
                        AffineTransform n1 = graficos.getTransform();
                        
                            graficos.rotate(Math.toRadians(ang), obj1.getPosX()+obj1.getLargura(), 
                                            obj1.getPosY()+obj1.getAltura());
                            
                            
                                graficos.drawImage(obj1.getImg1(), obj1.getPosX(),obj1.getPosY(),
                                            obj1.getLargura(),obj1.getAltura(),this);
                                
                                
                        graficos.setTransform(n1);
                        n1 = graficos.getTransform();
                        
                        
                          AffineTransform n2 = graficos.getTransform();
                        
                            graficos.rotate(Math.toRadians(ang*vel), obj2.getPosX()+obj2.getAltura(), 
                                            obj2.getPosY()+obj2.getLargura());
                            
                            
                                graficos.drawImage(obj2.getImg1(), obj2.getPosX(),obj2.getPosY(),
                                            obj2.getLargura(),obj2.getAltura(),this);
                                
                                
                        graficos.setTransform(n2);
                        n2 = graficos.getTransform();
                        
               graficos.dispose();
        
    }
    
    public void update()
    {
        if(a>this.getWidth())
        {
            a*=0;
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        this.update();
        this.ang++;
        this.vel--;
        this.a++;
			
        
        this.repaint();
       
    }
    
    
    
}
