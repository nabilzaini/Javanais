package pole.emploi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pole.emploi.src.Javanais;

class JavanaisTest {
	/**
	 * Tester le chiffrement
	 */
	@Test
	void chiffrerTest() {
		assertEquals("bavonjavour", Javanais.chiffrer("bonjour"));
		assertEquals("chavantave", Javanais.chiffrer("chante"));
		assertEquals("mavoyen", Javanais.chiffrer("moyen"));
		assertEquals("avexavemplave", Javanais.chiffrer("exemple"));
		assertEquals("avau", Javanais.chiffrer("au"));
	}
	/**
	 * Tester le déchiffrement
	 */
	@Test
	void dechiffrerTest() {
		assertEquals("bonjour", Javanais.dechiffrer("bavonjavour"));
		assertEquals("chante", Javanais.dechiffrer("chavantave"));
		assertEquals("moyen", Javanais.dechiffrer("mavoyen"));
		assertEquals("exemple", Javanais.dechiffrer("avexavemplave"));
		assertEquals("au", Javanais.dechiffrer("avau"));
		assertEquals("base", Javanais.dechiffrer("bavasave"));
		assertEquals("yavine", Javanais.dechiffrer("yavine"));
	}
	/**
	 * Tester le cas d'une phrase Nulle pour le chiffrement & déchiffrement
	 */
	@Test
	void testPhraseNulleTest() {
		assertEquals("", Javanais.chiffrer(null));
		assertEquals("", Javanais.dechiffrer(null));
		
	}
	
	/**
	 * Tester le cas d'une phrase Vide pour le chiffrement & déchiffrement
	 */
	@Test
	void testPhraseVideTest() {
		assertEquals("", Javanais.chiffrer(""));
		assertEquals("", Javanais.dechiffrer(""));
		
	}
	

}
