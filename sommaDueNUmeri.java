import javax.swing.JOptionPane;

public class sommaDueNUmeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int somma =0;
		String s = JOptionPane.showInputDialog("Inserisci Il primo numero ");
		String p = JOptionPane.showInputDialog("Inserisci Il secondo ");
		
		somma = Integer.parseInt(s) + Integer.parseInt(p);
		
		JOptionPane.showMessageDialog(null , "La soma dei due numeri e ’: " + somma );
	}

}
