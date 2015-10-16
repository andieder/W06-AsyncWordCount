package ch.hsr.mge.wordcount.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Hilfsklasse fuer eine Liste, die serialisierbar ist.
 *
 * @author Peter Buehler
 */
public class SerializableList<E> extends ArrayList<E> implements Serializable {

    private static final long serialVersionUID = 1L;

}
