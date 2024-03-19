
public class Persona {

	String nome;
	

	String indirizzo;
	
	public Persona(String nome, String indirizzo) {
		
		this.nome = nome ;
		this.indirizzo = indirizzo;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	public void setIndirizzo(String indirizzo) {
		
		this.indirizzo = indirizzo;
	}
	public String getTipo() {
		return("persona");
	}
	
}
