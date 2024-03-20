import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonMsgActionListener implements ActionListener {

	Finestra f1;
	Persona p1;
	public ButtonMsgActionListener(Finestra finestra) {
		// TODO Auto-generated constructor stub
		
		this.f1 = finestra;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String utenti = "";
		for (int i = 0; i < f1.lista.size(); i++) {
			utenti += f1.lista.get(i) + "\n";
		}
		
		
		
       JOptionPane.showMessageDialog(null,utenti);
	}

}
