import java.util.Scanner;

/*
 * Scrivere un programma che simula una A.I. 
 * Il programma attende un input dall'utente, reagisce solo alla parola "buongiorno"
 * Risponde con "Buongiorno, posso sapere il tuo nome?"
 * Se scrivete s�, vi chiede: "come ti chiami?", se scrivete no, risponde "addio".
 * Se scrivete altro cerca di capire se maschio o femmina e risponde benvenuto signore o
 * signora seguito dal nome 
 */


public class ClassIA {
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	String risposta;
    	
    	do {
    		risposta=in.nextLine();
    	} while ( ! risposta.equalsIgnoreCase("buongiorno") );
    	
		System.out.println("Buongiorno, posso sapere il tuo nome?");
		
		do {
			risposta=in.nextLine();
		} while (risposta.isEmpty()); // controllare che la stringa sia vuota o meno

		switch (risposta.toLowerCase()) {
			case "no":
				System.out.println("Addio");
				break;
			case "si":
				 System.out.println("dimmi il tuo nome per favore");
				 do {
					risposta=in.nextLine();
				 } while (risposta.isEmpty());
			default: // senza il break se esegue il caso 
				     // si continua anche qui
				   String nome=risposta.toLowerCase().replaceFirst(""+risposta.toLowerCase().charAt(0), ""+risposta.toUpperCase().charAt(0));
					// O anche: 
				    //String nome = risposta.substring(0, 1).toUpperCase() + risposta.substring(1).toLowerCase();
			
					if ( nome.equalsIgnoreCase("tobia") ||
						 nome.equalsIgnoreCase("andrea") || 
						 nome.charAt(nome.length()-1)=='o' ||
						 nome.charAt(nome.length()-1)=='e') {
						System.out.println("Buongiorno signor "+nome);
					} else if ( nome.charAt(nome.length()-1)=='a' ) {
						System.out.println("Buongiorno signora "+nome);
					} else {
						System.out.println("Ciao ciao");
					}
					break;
		} // case
	}

}
