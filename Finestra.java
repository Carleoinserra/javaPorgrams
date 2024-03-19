import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Finestra extends JFrame {
	
	
	String nome;
	JButton button_mostra;
	JButton button_msg;
	JButton button_messaggio;
    JLabel label1;
    JTextField campo1;
    JLabel label2;
    JTextField campo2;
    ArrayList<Persona> lista = new ArrayList<>();

	public static void main(String[] args) {
		
		Finestra  f1 = new Finestra("Finestra di benvenuto");
		
		
	}
	
	
	public Finestra(String titolo) {
		super(titolo);
		 nome = "Carlo";
		 
		
		// imposta la dimensione della finestra
		this.setSize(500, 500);
		
		// specifica che la chiusura della finestra deve
				// fare terminare l'intero programma
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// inizializza la prima casella di input
				label1 = new JLabel("Scrivi il tuo cognome");
				campo1 = new JTextField(40);
				
				
				label2 = new JLabel("Scrivi il tuo indirizzo");
				campo2 = new JTextField(40);
		
		
		// primo bottone (mostra il valore del contatore)
	   button_mostra = new JButton("Inserisci utente");
				// associa al bottone il suo comportamento
		button_mostra.addActionListener(new ButtonMostraActionListener());
		
		 button_msg = new JButton("Stampa");
		button_msg.addActionListener(new ButtonMsgActionListener(this ));
		
		 button_messaggio = new JButton("Mostra");
		button_messaggio.addActionListener(new ButtonStampaActionListener(this));
		
		// un panel e' un contenitore di elementi da
		// visualizzare in una finestra
	    JPanel panel = new JPanel();
	    
	    panel.add(label1);
	    panel.add(campo1);
	    panel.add(label2);
	    panel.add(campo2);
	    panel.add(button_mostra);
	    panel.add(button_msg);
	    panel.add(button_messaggio);
	    
	    this.add(panel);
	    
	    this.setVisible(true);
				
	}}


