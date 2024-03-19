import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonStampaActionListener implements ActionListener {

	Finestra f1;
	
	public ButtonStampaActionListener(Finestra finestra) {
		
		
		this.f1 = finestra;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nome = f1.campo1.getText();
		
		JOptionPane.showMessageDialog(null, "Buon pomeriggio da: "+ nome);

	}

}
