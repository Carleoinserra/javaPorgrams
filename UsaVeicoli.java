import java.util.ArrayList;

public class UsaVeicoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<veicolo> lista = new ArrayList<>();
		Vettura a = new Vettura("ad345", "Renault", "Captur", "CrossOver");
		Vettura b = new Vettura("ad346", "Fiat", "Panda", "CityCar");
		Motociclo c = new Motociclo("ad347", "Honda", "Ninja", 500);
		Motociclo d = new Motociclo("ad348", "Ducati", "Sport", 125);
		b.setGuasto();
		d.setGuasto();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).guasto == true) {
				System.out.println(lista.get(i).targa);
			}
		}
		
}
}