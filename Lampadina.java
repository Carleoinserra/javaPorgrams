
public class Lampadina {

	private String stato;
	public int maxClick = 10;
	public int numClick = 0;
	
	public Lampadina() {
		
		this.stato = "spenta";
	}
	
	public String stato() {
		return stato;
	}
	public void click() {
		
		if (this.stato.equals("spenta") && numClick < maxClick) {
			this.stato = "accesa";
			numClick++;
		}
		else if (this.stato.equals("accesa") && numClick < maxClick) {
			this.stato = "spenta";
			numClick++;
		}
		else {
			this.stato = "rotta";
		}
	}
	
}
