package ch.hsr.mge.wordcount.domain;

import ch.hsr.mge.wordcount.data.SerializableList;
import ch.hsr.mge.wordcount.data.WordCount;

/**
 * Legt die Methodensignatur fest, um einen Text auf die
 * Haeufigkeit von Worten zu pruefen.
 *
 * @author Peter Buehler
 */
public interface IWordCounter {

	/**
	 * Ermittelt die Anzahl gleicher Worte des Uebergebenen Textes.
	 * @param text
	 * @return Liste mit Zaehlern
	 */
	public SerializableList<WordCount> countWords(String text);
	
}
