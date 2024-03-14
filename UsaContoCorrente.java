
public class UsaContoCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ContoCorrente c1 = new ContoCorrente(); 
		
		ContoCorrente c2 = new ContoCorrente();
		//c1.versa(1000);
		//c1.preleva(30000);
		/*System.out.println("Il saldo è "+ c1.getSaldo());
		System.out.println("Il conto è "+ c1.getNumero());
		System.out.println("Il saldo è "+ c2.getSaldo());
		System.out.println("Il conto è "+ c2.getNumero());*/
		
		//ContoCorrente.tasso = 3;
		
		//chiamamo il metodo calcolaInteressi
		// c1.calcolaInteressi();
		c1.saldo = 15000;
		
		ContoCorrente.saldo = 20000;
		
		
		// invochiamo il metodo toString sull'oggetto
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
