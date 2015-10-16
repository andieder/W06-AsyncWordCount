package ch.hsr.mge.wordcount.data;

import java.io.Serializable;

public class FileHolder implements Serializable {

    private static final long serialVersionUID = 1L;

    public final String filename;
    public final int id;
    public final int size;

    public FileHolder(String filename, int id, int size) {
        super();
        this.filename = filename;
        this.id = id;
        this.size = size;
    }
}
