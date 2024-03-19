import java.util.Scanner;

public class UsaQuesito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		Quesito q1 = new Quesito("Qual è la capitale di Francia?", "Parigi", 3);
		System.out.println(q1.domanda);
		String risposta = input.nextLine();
		System.out.println("Hai totalizzato "+ "per la domanda " + q1.ask(risposta));
		
		
	}

}
