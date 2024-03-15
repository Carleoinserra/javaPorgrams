import java.util.Scanner;

public class UsaBancomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        ContoCorrente c1 = new ContoCorrente(10000); 
		
		ContoCorrente c2 = new ContoCorrente(30000);
		
		Bancomat b1 = new Bancomat();
		b1.addConto(c1);
		b1.addConto(c2);
		
		int numero = 5;
		int scelta = 5;
		
		do {
			scelta = input.nextInt();
			if (scelta != 0) {
			if (scelta == 1) {
			System.out.println("Il numero del conto: ");
			numero = input.nextInt();
			System.out.println("Quanto vuoi prelevare: ");
			int importo = input.nextInt();
			b1.preleva(numero, importo);}
			else if (scelta == 2) {
				System.out.println("Il numero del conto: ");
				numero = input.nextInt();
				System.out.println("Quanto vuoi versare: ");
				int importo = input.nextInt();
				b1.versamento(numero, importo);
				
				
			}
			
		}}
		while(scelta != 0);
		b1.stampa();
	}

}
