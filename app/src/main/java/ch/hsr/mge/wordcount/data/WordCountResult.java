package ch.hsr.mge.wordcount.data;

import java.io.Serializable;
import java.util.List;

/**
 * Beinhaltet das Resultat.
 *
 * @author Peter Buehler
 */
public class WordCountResult implements Serializable {

    private static final long serialVersionUID = 1L;

    public final FileHolder fileHolder;
    public final List<WordCount> counters;

    public WordCountResult(FileHolder fileHolder, List<WordCount> counters) {
        super();
        this.fileHolder = fileHolder;
        this.counters = counters;
    }
}
