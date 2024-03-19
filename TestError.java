import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
/*		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		
		try {
			int x = input.nextInt();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		*/
		
	ArrayList <Integer> lista = new ArrayList<>();
	lista.add(3);
	lista.add(4);
 try {	
	for (int i = 0; i < 5; i++) {
		System.out.println(lista.get(i));
	}}
 catch(Exception e) {
	 System.out.println("L'array contiene solo " + lista.size()+ " elementi");
 }
		
	}

}
