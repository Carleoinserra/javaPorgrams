import java.io.Serializable;
import java.util.ArrayList;

public class Bancomat implements Serializable {
 
	
	ArrayList<ContoCorrente> lista;
	
	public Bancomat() {
		
		lista = new ArrayList();
	}
	
	public void addConto(ContoCorrente c) {
		
		lista.add(c);
	}
	
public void stampa() {
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

public void preleva(int numero, int importo) {
	int ok = 0;
	for (var i = 0; i < lista.size(); i++) {
		
		if (lista.get(i).getNumero() == numero && lista.get(i).getSaldo() > importo) {
			
			lista.get(i).preleva(importo);
			System.out.println("Hai prelevato "+ importo);
		}
		else if (lista.get(i).getNumero() == numero && lista.get(i).getSaldo() < importo) {
			System.out.println("Importo non disponibile");
			
		}
		else if (lista.get(i).getNumero() != numero)  {
			
			ok++;
			
		}
		
		
	}
	if (ok >= lista.size()) {
		System.out.println("Numero non riconosciuto");
	}
}
public void versamento(int numero, int importo) {
	int ok = 0;
	for (var i = 0; i < lista.size(); i++) {
		
		if (lista.get(i).getNumero() == numero && importo <= 10000) {
			
			lista.get(i).versa(importo);
			System.out.println("Hai versato "+ importo);
		}
		else if (lista.get(i).getNumero() == numero && importo > 10000) {
			System.out.println("Non puoi versare più di 10000");
			
		}
		else if (lista.get(i).getNumero() != numero)  {
			
			ok++;
			
		}
		
		
	}
	if (ok >= lista.size()) {
		System.out.println("Numero non riconosciuto");
	}
}
	
			
			

	}
	
	

