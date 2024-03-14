
public class UsaContoCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContoCorrente c1 = new ContoCorrente(10000); 
		
		c1.versa(1000);
		c1.preleva(30000);
		System.out.println("Il saldo è "+ c1.saldo);
	}

}
