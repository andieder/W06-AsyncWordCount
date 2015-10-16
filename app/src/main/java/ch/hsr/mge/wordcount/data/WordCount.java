package ch.hsr.mge.wordcount.data;

import java.io.Serializable;

/**
 * Beinhaltet ein Wort und wie haeufig das Wort im Text vorhanden war.
 *
 * @author Peter Buehler
 */
public class WordCount implements Serializable, Comparable<WordCount> {

    private static final long serialVersionUID = 1L;

    private String word;
    private int count;

    public WordCount(String word) {
        super();
        this.word = word;
        this.count = 0;
    }

    public void increment() {
        ++count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(WordCount another) {
        if (count > another.count) {
            return -1;
        } else if (count < another.count) {
            return 1;
        } else {
            return 0;
        }
    }

}
