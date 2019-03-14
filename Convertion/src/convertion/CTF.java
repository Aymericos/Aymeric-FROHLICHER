
package convertion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class CTF extends JFrame implements ActionListener{
// CrÃ©ation des diffÃ©rent Panel
	
        JPanel Prin = new JPanel();
	JPanel Cel = new JPanel();
        JPanel Fah = new JPanel();
	
	// CrÃ©ation des diffÃ©rent Label
	JLabel C = new JLabel("Celsius");
	JLabel F = new JLabel("");
	
	
	// CrÃ©ation des diffÃ©rent TextField
    JTextField CText =new JTextField(5);
    
     
    
    // CrÃ©ation des diffÃ©rent Bouton
    JButton FButton = new JButton("Convert");
	
    // Constructeur
	CTF (){
		super();
		build();
	}
	
	// Creation de la fenetre
	private void build() {
		
	// DÃ©finition des paramÃ¨tres de la fenetre
	this.setTitle("Convert Celsius to Fahrenheit"); // DÃ©finition du titre de la page
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Boutton permettant de fermer la page
	this.setSize(400,170); // Largeur,Hauteur
	this.setLocationRelativeTo(null); //On centre la fenÃªtre sur l'Ã©cran
	this.setResizable(false); //On interdit la redimensionnement de la fenÃªtre
	    
	//DÃ©finition du Panel haut
	    Prin.setLayout(new BoxLayout(Prin,BoxLayout.PAGE_AXIS));
	    Prin.add(Cel);
	    Prin.add(Fah);
	    
            Cel.add(CText);
            Cel.add(C);
            
            Fah.add(FButton);
            Fah.add(F);
            
            FButton.addActionListener(this);
             
	    this.add(Prin);
	    
	    
	}

	// Creation des actions / Interactions avec les boutons
	public void actionPerformed(ActionEvent e) {
		  Object source = e.getSource();
		  
		  // Si le bouton est actionné
		  if (source == FButton) {
			  
			  // Convertion d'un text en int
			  int convert = Integer.parseInt(CText.getText());
			 
			  int Fahre = (int)(convert*(1.8)+32);
			  
			  F.setText(Fahre +" Fahrenheit");
		  }
		  
		 
	       SwingUtilities.updateComponentTreeUI(this);
	}

    
}
