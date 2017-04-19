/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Interface.PanneauImage;

public class ThreadImage extends Thread{
    
    private PanneauImage paneI;
    public ThreadImage(PanneauImage p)
    {
        paneI = p;
    }
    public void run()
    {
        while(true)
        {
            try{
                Thread.sleep(8);
                paneI.bouge();
                paneI.repaint();                
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
