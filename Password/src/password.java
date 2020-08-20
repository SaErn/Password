/* Denna uppgift var ganska l�tt att genomf�r d� jag tidigare jobbat med det mesta tidigare.
 * Det enda nya jag st�tte p� var hur man kan j�mf�ra strings i java. Jag testade f�rst att
 * j�mf�ra med "String1 == String2" men uppt�ckte att d� att java inte j�mf�r det lagrade v�rdet
 * i variablerna utan j�mf�r ist�llet om dem refererar till samma objekt i minnet. D�rf�r 
 * fick jag ist�llet anv�nda mig av string-klassens equals-metod som kan j�mf�ra stringarnas
 * v�rde
 */
import java.io.IOException;
import java.util.*;

public class password {

	public static void main(String[] args) {
		System.out.println("Welcome Agent Mulder\nYour password is 1wAnTt0BeL1eVe");
		Scanner reader = new Scanner(System.in); //Anv�nds f�r att ta emot input
		String input; 							 //Anv�nds f�r att lagra input
		int counter = 0;						 //H�ller r�kning p� antal f�rs�k

		System.out.print("Input password: ");
		input = reader.nextLine();				 //Tar emot input

		//Tre if-satser i f�ljd som testar om antal gjorda f�rs�k �r f�rre �n 3
		if (counter < 3) {
			//N�stlad if-sats som testar om string-v�rdet i input matchar l�senordet eller inte
			if (input.equals("1wAnTt0BeL1eVe")) {
				System.out.println("Password is correct");
				//Om l�senord korrekt st�lls v�rdet p� counter till 4 som g�r att villkoret f�r 
				//kommande if-satser som testar antal f�rs�k inte uppfylls s� dem "hoppas �ver"
				counter = 4;
			} else {
				System.out.println("Password is incorrect");
				//Om l�senord fel adderas 1 till int-variabel som h�ller r�kning p� antal f�rs�k
				counter += 1;
			}
		}

		if (counter < 3) {
			System.out.print("Input password: ");
			input = reader.nextLine();
			if (input.equals("1wAnTt0BeL1eVe")) {
				System.out.println("Password is correct");
				counter = 4;
			} else {
				System.out.println("Password is incorrect\nOne try left!");
				counter += 1;
			}
		}
		
		if (counter < 3) {
			System.out.print("Input password: ");
			input = reader.nextLine();
			if (input.equals("1wAnTt0BeL1eVe")) {
				System.out.println("Password is correct");
				counter = 4;
			} else {
				System.out.println("Password is incorrect");
				System.out.println("Attempted breach detected\nAsassins have been dispatched to your location.");
				System.out.println("PROGRAM TERMINATED. COMPUTER WILL SELF DESTRUCT IN 10 SECONDS");
			}
		}
		
		//Fj�rde if-sats som testar om korrekt l�senord har angivits
		if(counter == 4) {
			System.out.print("Welcome to the x-files\nTo do list: \n-Find truth\n-Don't get abducted\n-Always trust gut feeling instead of Scullys logic\n");
			System.out.println("Press enter to exit program");
			
			//System.in.read h�ller programmet ig�ng till n�sta byte fr�n input stream mottagits
			//Dvs. n�sta g�ng man trycker p� enter
			//Eclipse kr�ver try-catch sats tillsammans med system.in.read d� den l�tt kan 
			//ge exception
			try {
			System.in.read();
			}catch(IOException e) {
				
			}
		}
		
		//Annat s�tt att g�ra p� med while-loop som loopar koden 3 g�nger
		/* while (counter < 3) { 
		 *		//Programmet ber anv�ndaren ange l�senord och tar emot input
		 * 		System.out.print("\nInput password: "); 
		 * 		input = reader.nextLine(); 
		 * 		// Equals-metoden fr�n String-klassen j�mf�r inneh�llet lagrat i input-objektet 
		 * 		// med angiven string inom parentesen 
		 * 		if (input.equals("1wAnTt0BeL1eVe")) { 
		 * 			System.out.println("Password correct");
		 * 			//Int-variabel f�r h�lla r�kning p� f�rs�k s�tts till 3 s� loopen bryts
		 * 			counter = 3; } 
		 * 		else { 
		 * 			System.out.println("\nIncorrect Password"); 
		 * 			counter++;
		 * 			if (counter == 1) { 
		 * 				System.out.println("Try again"); 
		 * 			} else if(counter == 2){ 
		 * 				System.out.println("One try left!"); 
		 * 			} 
		 * 		else { 
		 * 			System.out.println("Attempted breach detected\nAsassins have been dispatched to your location."); 
		 * 		} 
		 * 	} 
		 * }
		 * 
		 * if(counter == 4) {
		 *	 System.out.print("Welcome to the x-files\nTo do list: Find truth\nDon't get abducted\n");
		 *		System.out.println("Press enter to exit program");
		 * 	
		 *		try {
		 *			System.in.read();
		 *		}catch(IOException e) 
		 *		{
		 *		
		 *		}
		 *	}
		 */
	}

}
