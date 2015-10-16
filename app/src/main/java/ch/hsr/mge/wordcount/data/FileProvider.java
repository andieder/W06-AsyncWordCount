package ch.hsr.mge.wordcount.data;

import java.util.Arrays;
import java.util.List;

import ch.hsr.mge.wordcount.R;

public class FileProvider {

    public static List<FileHolder> getFiles() {
        return Arrays.asList(
                new FileHolder("lorem.txt", R.raw.lorem, 1),
                new FileHolder("rfc2396.txt", R.raw.rfc2396, 83),
                new FileHolder("rfc2616.txt", R.raw.rfc2616, 413));
    }
}
