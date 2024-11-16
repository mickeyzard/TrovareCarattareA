package StringaA;

import java.util.Scanner;

public class InputUser {
	    
	    //Variabile privata con nome stringUser
	    private String stringUser;
	    
	    //crea un metodo Get per restituire valore di stringUser alle altre classi
	    public String getUserString(){
	    
	    return stringUser;
	}
	    
	    
	    public void scan(){

	        //Inizializzo oggetto della classe Scanner
	    	Scanner scan = new Scanner(System.in);
	    	
	        //Chiede all'utente di inserire una parola
	        System.out.println("Inserisci una parola: ");
	        
	        //Prende l'input dell'utente e lo assegna alla variabile stringUser
	        stringUser = scan.nextLine();
	        
	    }
	}


