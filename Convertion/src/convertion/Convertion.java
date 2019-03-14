package convertion;

import javax.swing.*;

public class Convertion {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
			
		public void run(){
			CTF cf = new CTF();
			cf.setVisible(true);
				
		}
		});

    }
    
}
