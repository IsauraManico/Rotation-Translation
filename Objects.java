


import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author isaura
 */
public class Objects 
{
    
    private int posX,posY,largura,altura;
    
    private int velX = 10,velY = 10;
    
    private Image img1;

    public Objects(int posX, int posY, int largura, int altura)
    {
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;
    }
    
    public void load()
    {
        img1 = new ImageIcon(getClass().getResource("img/wings.png")).getImage();
        
        this.largura = img1.getWidth(null);
        
        this.altura = img1.getHeight(null);
        
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public Image getImg1() {
        return img1;
    }

    public void setImg1(Image img1) {
        this.img1 = img1;
    }
    
    
    
    
    
    
    
    
}
