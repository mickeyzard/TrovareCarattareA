package StringaA;


public class Main {

	public static void main(String[] args) {
		
		//Inizializzo oggetto di tipo InputUser
		InputUser input1 = new InputUser();
		
		//Chiamo metodo scan() per chiedere input dell'utente
		input1.scan();
		
		//Inizializzo oggetto di tipo trovareA con parametro input1 = che è uguale all'input dell'utente
		TrovaA trovareA = new TrovaA(input1);
		
		//Chiamo metodo trovareA() per controllare quante volte 'a' sta nella stringa
		trovareA.TrovareA();
		
		//Chiamo metodo stampaA() per stampare il numero di volte in cui 'a' è stato trovato
		trovareA.stampaA();

	}

}
