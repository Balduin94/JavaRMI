import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Panel extends JPanel { 
	public JButton bouton2;
	public Panel() {
		bouton2 = new JButton();
		bouton2.setText("Ajouter v�hicule");
		this.add(bouton2);
	}

}