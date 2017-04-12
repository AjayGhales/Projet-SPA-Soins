/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.awt.Rectangle;
import java.awt.image.*;
import java.awt.*;
/**
 *
 * @author justi
 */
public class ParoiImage {
    
    private Image Banner = Toolkit.getDefaultToolkit().getImage("animation-2.png");
    
    public ParoiImage()
    {
        
    }
    public void paint(Graphics g)
    {
        g.drawImage(Banner,0,0,null);
    }
}
