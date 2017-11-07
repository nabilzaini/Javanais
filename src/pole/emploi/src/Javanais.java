package pole.emploi.src;

import java.util.Arrays;
import java.util.List;

public class Javanais {
	private static final String SYLABE_PARSITE = "av";
	private static List<String> tabVoyelle = Arrays.asList("a", "A", "i", "I", "u", "U", "o", "O", "e", "E", "y", "Y");

	/**
	 * Permet de vérifier si le caractère est voyelle ou pas
	 * 
	 * @param param
	 *            caractère
	 * @return l'état de vérification
	 */
	public static boolean isVoyelle(char param) {
		return tabVoyelle.contains(String.valueOf(param));
	}

	/**
	 * Permet de vérifier si le caractère est consonne ou pas
	 * 
	 * @param param
	 *            caractère
	 * @return l'état de vérification
	 */
	public static boolean isConsonne(char param) {
		return !isVoyelle(param);
	}

	/**
	 * Permet de construire la phrase en Javanais
	 * 
	 * @param phrase
	 *            Phrase en entrée
	 * @return Phrase en Javanais
	 */
	public static String chiffrer(String phrase) {
		int i = 0;
		char caractere;
		boolean etatConsonne = true;
		StringBuffer resultat = new StringBuffer();
		if (null != phrase && !phrase.isEmpty()) {
			int taillePhrase = phrase.length();
			while (i < taillePhrase) {
				caractere = phrase.charAt(i);
				if (etatConsonne && isVoyelle(caractere)) {
					resultat.append(SYLABE_PARSITE).append(caractere);
				} else {
					resultat.append(caractere);
				}
				etatConsonne = isConsonne(caractere);
				i++;
			}

		}
		return resultat.toString();
	}

	/**
	 * Permet de déchiffrer une phrase en Javanais
	 * 
	 * @param phrase
	 *            Phrase en Javanais
	 * @return Phrase déchiffrée
	 */
	public static String dechiffrer(String phrase) {
		int i = 0;
		StringBuffer resultat = new StringBuffer();
		boolean isConsonne = true;
		if (null != phrase && !phrase.isEmpty()) {
			int taillePhrase = phrase.length() - 2;
			while (i < taillePhrase) {
				if (isConsonne && phrase.charAt(i) == 'a' && phrase.charAt(i + 1) == 'v' && isVoyelle(phrase.charAt(i + 2))) {
					resultat.append(phrase.charAt(i + 2));
					i += 3;
				} else {
					isConsonne = isConsonne(phrase.charAt(i));
					resultat.append(phrase.charAt(i));
					i += 1;
				}
			}
			if (i < phrase.length()) {
				resultat.append(phrase.substring(i));
			}
		}

		return resultat.toString();
	}

}
