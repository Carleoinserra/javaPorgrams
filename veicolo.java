
public class veicolo {

	
	String targa;
	String marca;
	String modello;
    boolean guasto = false;
	
	public veicolo(String targa, String marca, String modello) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
	}
	
	public void setTarga(String targa) {
		
		this.targa = targa;
	}
public void setMarca(String marca) {
		
		this.marca = marca;
	}
public void setModello(String modello) {
	
	this.modello = modello;
}
public void setGuasto() {
	guasto = true;
}

@Override
public String toString() {
	return "veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", guasto=" + guasto + "]";
}

}
