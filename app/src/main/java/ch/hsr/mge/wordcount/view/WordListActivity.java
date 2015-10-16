package ch.hsr.mge.wordcount.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import ch.hsr.mge.wordcount.R;
import ch.hsr.mge.wordcount.data.WordCount;
import ch.hsr.mge.wordcount.data.WordCountResult;

public class WordListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Intent auslesen
        Intent intent = getIntent();
        if (intent == null) {
            Log.d(FileActivity.DEBUG_TAG, "intent is null");
        }

        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            Log.d(FileActivity.DEBUG_TAG, "bundle is null");
        }

        WordCountResult result = (WordCountResult) bundle.get(FileActivity.KEY_WORD_RESULT);
        if (result == null) {
            Log.d(FileActivity.DEBUG_TAG, "result is null");
        }

        // Liste erstellen
        ListView listView = (ListView) findViewById(R.id.listView);

        // Liste mit Daten fuellen
        ArrayAdapter<WordCount> adapter = new WordCountArrayAdapter(this, result.counters);
        listView.setAdapter(adapter);

        // Dateiname setzen
        getSupportActionBar().setTitle(getResources().getText(R.string.app_name) +
                " von " + result.fileHolder.filename);
    }


    /**
     * Adapter, um die ListView mit Daten zu bestuecken.
     *
     * @author Peter Buehler
     */
    public static class WordCountArrayAdapter extends ArrayAdapter<WordCount> {

        private final Context context;
        private final List<WordCount> values;

        public WordCountArrayAdapter(Context context, List<WordCount> values) {
            super(context, R.layout.list_item, values);
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(R.layout.list_item, parent, false);

            WordCount wc = values.get(position);

            ((TextView) rowView.findViewById(R.id.countTextView)).setText("" + wc.getCount());
            ((TextView) rowView.findViewById(R.id.wordTextView)).setText("" + wc.getWord());

            return rowView;
        }
    }

}
