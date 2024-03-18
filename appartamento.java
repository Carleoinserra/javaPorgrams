
public class appartamento {

	int spazio;
	String proprietario;
	
	public appartamento(int spazio, String proprietario) {
		
		this.spazio = spazio;
		this.proprietario = proprietario;
			}
	public String visualizza() {
		return ("Il proprietario della casa è "+ proprietario + " la grandezza della casa è "+ spazio + " metri quadri");
	}
	
}
