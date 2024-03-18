
public class AppartamentoInVendita extends appartamento {

	int costoTotale;
	
	public AppartamentoInVendita(int spazio, String proprietario, int costoTotale) {
		super(spazio, proprietario);
		this.costoTotale = costoTotale;
		
		
	}
	
	public String visualizza() {
		
		return ("Il proprietario della casa è "+ proprietario + " la grandezza della casa è "+ spazio + " metri quadri" +
		" al costo totale di " + costoTotale);
	}
	
	

}
