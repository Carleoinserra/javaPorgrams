
public class Vettura extends veicolo {
	String tipologia;
	
	
	public Vettura(String targa, String marca, String modello, String tipologia) {
		super(targa, marca, modello);
		
		this.tipologia = tipologia;
	}


	@Override
	public String toString() {
		return "Vettura [tipologia=" + tipologia + ", targa=" + targa + ", marca=" + marca + ", modello=" + modello
				+ ", guasto=" + guasto + "]";
	}

	
}
