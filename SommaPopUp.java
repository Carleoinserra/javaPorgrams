import java.awt.*;
import javax.swing.*;


public class SommaPopUp {
	
public static void main ( String [] args ) {
	
int somma =0;

int scelta ;

do {
// chiede in input un numero (il popup lo legge come stringa )
String s = JOptionPane.showInputDialog("Inserisci un numero ");

somma += Integer.parseInt(s); // eccezione se utente sbaglia tipo
// chiede se si vuole continuare . Risposte possibili Si/No.
// titolo finestra pop -up: Scelta .
scelta = JOptionPane.showConfirmDialog(null ,"Vuoi inserire un altro numero?",
" Scegli cosa fare ", JOptionPane.YES_NO_OPTION );
} while ( scelta != JOptionPane.NO_OPTION ); // notare
// stampa il risultato
JOptionPane.showMessageDialog(null , "La somma e ’: " + somma );
}
}

