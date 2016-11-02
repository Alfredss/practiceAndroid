package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainCheckBoxActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    Button btnanaliza;
    CheckBox amarillo, azul, rojo, rosa, verde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_box);
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
        boton = (Button) findViewById(R.id.chekboxbtn);
        boton.setOnClickListener(this);

        btnanaliza = (Button) findViewById(R.id.btnAnaliza);
        btnanaliza.setOnClickListener(this);

        //CHECKBOX
        amarillo = (CheckBox) findViewById(R.id.cbamarillo);
        azul = (CheckBox) findViewById(R.id.cbazul);
        rojo = (CheckBox) findViewById(R.id.cbrojo);
        rosa = (CheckBox) findViewById(R.id.cbrosado);
        verde = (CheckBox) findViewById(R.id.cbverde);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chekboxbtn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnAnaliza:
                StringBuffer result = new StringBuffer();
                result.append("Amarillo: ").append(amarillo.isChecked());
                result.append("Azul: ").append(azul.isChecked());
                result.append("Rojo: ").append(rojo.isChecked());
                result.append("Rosado: ").append(rosa.isChecked());
                result.append("Verde: ").append(verde.isChecked());
                Toast.makeText(MainCheckBoxActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
}
