
public class usaLampadina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lampadina l1 = new Lampadina();
		System.out.println(l1.stato());
		l1.click();
		System.out.println(l1.stato());
		for (int i = 0; i < 16; i++) {
			l1.click();
			System.out.println(l1.stato());
		}
	}

}
