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
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainButterKnifeActivity extends AppCompatActivity {
    @BindView(R.id.tvA) TextView textoA;
    @BindView(R.id.tvB) TextView textoB;

    @BindView(R.id.btnMsg) Button botonMSG;
    /*
    @OnClick(R.id.btnMsg)
    public void msg(){
        Toast.makeText(MainButterKnifeActivity.this, "Mensaje de Bienvenida", Toast.LENGTH_SHORT).show();
    }*/

    @BindView(R.id.btnBK) Button botonRegresar;
    @OnClick({R.id.btnBK, R.id.btnMsg})
    public void regresarAndMsg(){
        Toast.makeText(MainButterKnifeActivity.this, "Salimos de Butter Knife", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_butter_knife);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
