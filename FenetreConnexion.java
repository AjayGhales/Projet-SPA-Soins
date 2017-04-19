/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.*;
import java.awt.Image;
//import java.awt.event.WindowEvent;
/**
 *
 * @author justi
 */
public class FenetreConnexion extends JFrame{
    
    //private Toolkit windowToolKit = getToolkit();
    //private Dimension windowSize = windowToolKit.getScreenSize();
    private Container cont;
    private Image icone = Toolkit.getDefaultToolkit().getImage("empreinte.jpg");
  
   
    
    public FenetreConnexion()
    {
        super("SPA");
        setBounds(350,150,1000,600);
        
        this.addWindowListener(new WindowAdapter()
        {public void windowClosing(WindowEvent e){System.exit(0);}});
            
        PanneauConnexion pc = new PanneauConnexion();
        PanneauImage pane = new PanneauImage("animation-2.png");
        
        cont = getContentPane(); 
        cont.setLayout(new BorderLayout());
        
        cont.add(pc, BorderLayout.NORTH);    
        cont.add(pane, BorderLayout.CENTER);
       
     
        
        this.setIconImage(icone);
        setVisible(true);
    } 
}