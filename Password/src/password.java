/* Denna uppgift var ganska lätt att genomför då jag tidigare jobbat med det mesta tidigare.
 * Det enda nya jag stötte på var hur man kan jämföra strings i java. Jag testade först att
 * jämföra med "String1 == String2" men upptäckte att då att java inte jämför det lagrade värdet
 * i variablerna utan jämför istället om dem refererar till samma objekt i minnet. Därför 
 * fick jag istället använda mig av string-klassens equals-metod som kan jämföra stringarnas
 * värde
 */
import java.io.IOException;
import java.util.*;

public class password {

	public static void main(String[] args) {
		System.out.println("Welcome Agent Mulder\nYour password is 1wAnTt0BeL1eVe");
		Scanner reader = new Scanner(System.in); //Används för att ta emot input
		String input; 							 //Används för att lagra input
		int counter = 0;						 //Håller räkning på antal försök

		System.out.print("Input password: ");
		input = reader.nextLine();				 //Tar emot input

		//Tre if-satser i följd som testar om antal gjorda försök är färre än 3
		if (counter < 3) {
			//Nästlad if-sats som testar om string-värdet i input matchar lösenordet eller inte
			if (input.equals("1wAnTt0BeL1eVe")) {
				System.out.println("Password is correct");
				//Om lösenord korrekt ställs värdet på counter till 4 som gör att villkoret för 
				//kommande if-satser som testar antal försök inte uppfylls så dem "hoppas över"
				counter = 4;
			} else {
				System.out.println("Password is incorrect");
				//Om lösenord fel adderas 1 till int-variabel som håller räkning på antal försök
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
		
		//Fjärde if-sats som testar om korrekt lösenord har angivits
		if(counter == 4) {
			System.out.print("Welcome to the x-files\nTo do list: \n-Find truth\n-Don't get abducted\n-Always trust gut feeling instead of Scullys logic\n");
			System.out.println("Press enter to exit program");
			
			//System.in.read håller programmet igång till nästa byte från input stream mottagits
			//Dvs. nästa gång man trycker på enter
			//Eclipse kräver try-catch sats tillsammans med system.in.read då den lätt kan 
			//ge exception
			try {
			System.in.read();
			}catch(IOException e) {
				
			}
		}
		
		//Annat sätt att göra på med while-loop som loopar koden 3 gånger
		/* while (counter < 3) { 
		 *		//Programmet ber användaren ange lösenord och tar emot input
		 * 		System.out.print("\nInput password: "); 
		 * 		input = reader.nextLine(); 
		 * 		// Equals-metoden från String-klassen jämför innehållet lagrat i input-objektet 
		 * 		// med angiven string inom parentesen 
		 * 		if (input.equals("1wAnTt0BeL1eVe")) { 
		 * 			System.out.println("Password correct");
		 * 			//Int-variabel för hålla räkning på försök sätts till 3 så loopen bryts
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
