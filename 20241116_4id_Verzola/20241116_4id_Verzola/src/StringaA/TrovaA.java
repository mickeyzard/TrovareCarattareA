package StringaA;

public class TrovaA {
	

    private int conta = 0;
	private String input;
    
    //Creo costruttore che ha come parametro input dell'utente
    public TrovaA(InputUser input) {
    	
    this.input = input.getUserString();
    }

    
    // Creo un metodo che serve a trovare e contare quante volte 'a' si trova nella parola inserita dall'utente	
    public void TrovareA(){
    	
    	//ciclo per controlalre ogni carattere della Stringa
        for(int i = 0; i < input.length(); i++){
        
        	//Condizione per controllare se è presente la 'a' ed incrementare il contatore di 1
            if (input.charAt(i) == 'a'){
                conta = conta + 1;
            }
        }
        
    }
    
    
    /*
    Creo metodo che stampa quanto volte è stato trovato il carattere 'a', e stampa 'a' maiuscolo per 
    il numero di volte che è stato trovato
    */
    public void stampaA(){
        System.out.println("La parola dell'utente contiene \"" + conta + "\" volte la lettera 'a'");
        System.out.print("\n");
        for(int i = 0; i < conta; i++){
            System.out.print("A");
        }
        System.out.println(" ");
    }
     
}


