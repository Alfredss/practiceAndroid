package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //instanciamos
    Button boton;
    Button botonRadioButon;
    Button botonSpinner;
    Button botonToggle;
    Button botonScrollView;
    Button botonHorizontalScrollView;
    Button botonCuadroDialogo;
    Button botonDialogImage;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        boton = (Button) findViewById(R.id.irventana2);
        boton.setOnClickListener(this);

        //boton radiogroup
        botonRadioButon = (Button) findViewById(R.id.bradiobuton);
        botonRadioButon.setOnClickListener(this);

        //boton spinner
        botonSpinner = (Button) findViewById(R.id.btnSpinner);
        botonSpinner.setOnClickListener(this);

        //boton toggle
        botonToggle = (Button) findViewById(R.id.btntoggle);
        botonToggle.setOnClickListener(this);

        //boton scroll view
        botonScrollView = (Button) findViewById(R.id.btnScrollView);
        botonScrollView.setOnClickListener(this);

        //boton horizontal scroll view
        botonHorizontalScrollView = (Button) findViewById(R.id.btnHorizontalScrollView);
        botonHorizontalScrollView.setOnClickListener(this);

        //cuadro de dialogo
        botonCuadroDialogo = (Button) findViewById(R.id.btncuadrodialogo);
        botonCuadroDialogo.setOnClickListener(this);
        edit = (EditText) findViewById(R.id.edt);

        //cuadro de dialogo con image
        botonDialogImage = (Button) findViewById(R.id.btndialogimage);
        botonDialogImage.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.irventana2:
                Intent intent1 = new Intent(this, Main2Activity.class);
                String dato = edit.getText().toString();
                intent1.putExtra("dato", dato);
                startActivity(intent1);
                break;

            case R.id.bradiobuton:
                Intent intent2 = new Intent(this, Main3Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnSpinner:
                Intent intent3 = new Intent(this, MainSpinnerActivity.class);
                startActivity(intent3);
                break;
            case R.id.btntoggle:
                Intent intent4 = new Intent(this, MainToggleActivity.class);
                startActivity(intent4);
                break;
            case R.id.btnScrollView:
                Intent intent5 = new Intent(this, MainScrollViewActivity.class);
                startActivity(intent5);
                break;
            case R.id.btnHorizontalScrollView:
                Intent intent6 = new Intent(this, MainHorizontalScrollViewActivity.class);
                startActivity(intent6);
                break;
            case R.id.btncuadrodialogo:
                Intent intent7 = new Intent(this, MainCuadroDialogoActivity.class);
                startActivity(intent7);
                break;
            case R.id.btndialogimage:
                Intent intent8 = new Intent(this, MainDialogImageActivity.class);
                startActivity(intent8);
                break;
            default:
                break;
        }
    }
}
