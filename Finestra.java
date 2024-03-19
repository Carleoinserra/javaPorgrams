import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Finestra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame menu = new JFrame("La mia prima finestra");
		// imposta la dimensione della finestra
		menu.setSize(500, 500);
		
		// specifica che la chiusura della finestra deve
				// fare terminare l'intero programma
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// primo bottone (mostra il valore del contatore)
		JButton button_mostra = new JButton("Mostra");
				// associa al bottone il suo comportamento
		button_mostra.addActionListener(new ButtonMostraActionListener());
		
		JButton button_msg = new JButton("Messaggio");
		button_msg.addActionListener(new ButtonMsgActionListener());
		
		// un panel e' un contenitore di elementi da
		// visualizzare in una finestra
	    JPanel panel = new JPanel();
	    panel.add(button_mostra);
	    panel.add(button_msg);
	    menu.add(panel);
	    
	    menu.setVisible(true);
				
	}

}
