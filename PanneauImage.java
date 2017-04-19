/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import Business.ThreadImage;
/*
 *
 * @author justi
 */
public class PanneauImage extends JPanel
{
    private Image img;
    private int x = -100;
    private int y = -100;
    
    PanneauImage(String s)
    {
        img = getToolkit().getImage(s);
        ThreadImage ti = new ThreadImage(this);
        ti.start();
       
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, x, y, 480,200, this);
    }
    public void bouge()
    {
       if( y == this.getTailleY() && x == this.getTailleX())
        {   
            x += 0;
            y += 0;
        }
        else
        {
            if(y <  this.getTailleY())
            {
                y+=1;

            }
            else
            {
                y -=1;
            }
            if( x <  this.getTailleX())
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
    }
    public int getTailleY()
    {
        return (this.getHeight()/2)- 100;
    }
    public int getTailleX()
    {
        return (this.getWidth()/2)-240;
    }
}
