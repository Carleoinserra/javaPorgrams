
public class AppartamentoInAffitto extends appartamento {

	int costoMensile;
	
	public AppartamentoInAffitto(int spazio, String proprietario, int costoMensile) {
		super(spazio, proprietario);
		
		this.costoMensile = costoMensile;
		
		
	}
	
	public String visualizza() {
		
		return ("Il proprietario della casa è "+ proprietario + " la grandezza della casa è "+ spazio + " metri quadri" +
		" al costo mesnile di " + costoMensile);
	}
	
	

}