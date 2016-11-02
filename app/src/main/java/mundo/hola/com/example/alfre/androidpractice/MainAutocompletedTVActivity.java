package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainAutocompletedTVActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    Button botonAutocompletar;
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_autocompleted_tv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        boton = (Button) findViewById(R.id.autocompletedbtn);
        boton.setOnClickListener(this);

        botonAutocompletar = (Button) findViewById(R.id.btnAutocompletar);
        botonAutocompletar.setOnClickListener(this);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.acTexto);
        String [] nombres = {"Alfredo", "Alfonso", "Alberto", "Maria", "Martha", "Margarita"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,nombres);
        autoCompleteTextView.setThreshold(3);
        autoCompleteTextView.setAdapter(adapter);

        textView = (TextView) findViewById(R.id.txtAutocompletado);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAutocompletar:
                String cadena = autoCompleteTextView.getText().toString();
                textView.setText(cadena);
                break;
            case R.id.autocompletedbtn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
