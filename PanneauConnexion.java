/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
//import java.awt.Container;
import java.awt.*;
//import java.awt.GridLayout;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
import javax.swing.*;
import java.lang.Object.*;
import java.awt.event.*;
/**
 *
 * @author justi
 */
public class PanneauConnexion extends JPanel {
    
    private JPanel panneauLog ;   
    private JLabel login, motDePasse;    
    private JTextField tLog;
    private JPasswordField tMdp;
    
    private JButton connexion;
    
    public PanneauConnexion()
    {
        //Panneau Principale
        panneauLog = new JPanel();       
        
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        
        panneauLog.setLayout(gb);
      
        c.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 1.0;
        //déclaration des composantes
        
        login = new JLabel("Login :");
       
        gb.setConstraints(login, c);
        panneauLog.add(login);
        
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = GridBagConstraints.REMAINDER;        
        tLog = new JTextField(30);
        gb.setConstraints(tLog, c);
        panneauLog.add(tLog);
        
        c.gridwidth = GridBagConstraints.RELATIVE;
        c.weightx = 0.0;
        motDePasse = new JLabel("Mot de passe :");
       
        gb.setConstraints(motDePasse, c);
        panneauLog.add(motDePasse);
        
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        tMdp = new JPasswordField(30);
        gb.setConstraints(tMdp, c);
        panneauLog.add(tMdp);
        
        // panneau bouton        
        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 0.0; 
        connexion = new JButton("Connexion");
        gb.setConstraints(connexion,c);
        panneauLog.add(connexion);
        
        GestionConnexion gC = new GestionConnexion();
        connexion.addActionListener(gC);
               
        this.add(panneauLog, BorderLayout.SOUTH);
      //  this.add(panneauBouton);
        
    }
    private class GestionConnexion implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           if(e.getSource() == connexion)
            {
                String mdp = new String(tMdp.getPassword());               
                if(tLog.getText().toString().equals("Admin") && mdp.equals("Admin"))
                {
                    JOptionPane.showMessageDialog((null),"Vous êtes bien connecté"," ",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog((null),"Vous vous êtes tromper"," ",JOptionPane.INFORMATION_MESSAGE);
                }
            } 
        }
    }
    public boolean estConnecté()
    {
        return true;
    }
}
