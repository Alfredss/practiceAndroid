package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    //Instanciamos
    Button boton;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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

        //Objetos
        boton = (Button) findViewById(R.id.irventana1);
        boton.setOnClickListener(this);

        tv = (TextView) findViewById(R.id.txtdato);

        //Recepcion de intents
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String cadena = (String) bundle.get("dato");
            tv.setText(cadena);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.irventana1:
                Intent intent =  new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
