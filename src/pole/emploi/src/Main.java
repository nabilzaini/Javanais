package pole.emploi.src;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tapez 1 pour le chiffrement");
		System.out.println("Tapez 2 pour le déchiffrement");
		System.out.println("Tapez 3 pour quitter le programme");
		
		while(scanner.hasNextLine()) {
			String phrase;
			String choix = scanner.nextLine();
			if(choix.equals("1")) {
				System.out.println("Tapez votre phrase à chiffrer : ");
				phrase = scanner.nextLine();
				System.out.println("votre phrase après le chiffrement est la suivante : " + Javanais.chiffrer(phrase));
			}
			if(choix.equals("2")) {
				System.out.println("Tapez votre phrase à déchiffrer : ");
				phrase = scanner.nextLine();
				System.out.println("votre phrase après le déchiffrement est la suivante : " + Javanais.dechiffrer(phrase));
		
			}
			if(choix.equals("3")) {
				break;
			}
		}
	}

}
