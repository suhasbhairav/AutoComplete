package main.tempcon.com.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] country_names;

    AutoCompleteTextView autoCompleteTextViewState;
    String[] state_names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.country);
        country_names = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country_names);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextViewState = (AutoCompleteTextView) findViewById(R.id.state);
        state_names = getResources().getStringArray(R.array.state_names);
        ArrayAdapter<String> adapterState = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state_names);
        autoCompleteTextViewState.setAdapter(adapterState);

    }
}
