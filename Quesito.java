
public class Quesito {

	String domanda;
	String rispostaCorretta;
	int punteggio;
	
	public Quesito(String domanda, String rispostaCorretta, int punteggio) {
		this.domanda = domanda;
		this.rispostaCorretta = rispostaCorretta;
		this.punteggio = punteggio;
	}
	
	public int ask(String rispostaUtente) {
		System.out.println(domanda);
		
		if (rispostaCorretta.equals(rispostaUtente)) {
			
			System.out.println("Risposta esatta");
		}
		else {
			System.out.println("Risposta errata");
			punteggio = 0;
		}
		return punteggio;
	}
}
