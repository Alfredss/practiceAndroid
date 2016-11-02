package mundo.hola.com.example.alfre.androidpractice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainDialogImageActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    Button botonRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialog_image);
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

        boton = (Button) findViewById(R.id.dialogimagebtn);
        boton.setOnClickListener(this);

        botonRegresar = (Button) findViewById(R.id.btn);
        botonRegresar.setOnClickListener(this);


    }
    //Sobreescribimos el metodo de dialog
    protected Dialog onCreateDialog(int id){
        Dialog dialog = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder = builder.setIcon(R.drawable.ic_launcher);
        builder = builder.setTitle("Quiere salir de esta aplicacion?");
        dialog = builder.create();
        return dialog;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dialogimagebtn:
                onCreateDialog(0).show();
                break;
            case R.id.btn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
