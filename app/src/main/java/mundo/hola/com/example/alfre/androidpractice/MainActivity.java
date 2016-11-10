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
    Button botonCheckBox;
    Button botonAutocompleted;
    Button botonHorizontal;
    Button botonVertical;
    Button botonPremisos;
    Button botonListView;
    Button botonPersonalizado;
    Button botonWebView;
    Button botonWebHtml;
    Button botonMediaPlayer;
    Button botonTableLayout;
    Button botonTextWatcher;
    Button botonAutocompleted2;
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

        //CheckBox
        botonCheckBox = (Button) findViewById(R.id.btnCheckBox);
        botonCheckBox.setOnClickListener(this);

        //Autocompleted TextView
        botonAutocompleted = (Button) findViewById(R.id.btnAutocompleted);
        botonAutocompleted.setOnClickListener(this);

        //Horizontal
        botonHorizontal = (Button) findViewById(R.id.btnHorizontal);
        botonHorizontal.setOnClickListener(this);

        //vertical
        botonVertical = (Button) findViewById(R.id.btnVertical);
        botonVertical.setOnClickListener(this);

        //permisos en android
        botonPremisos = (Button) findViewById(R.id.btnPermisos);
        botonPremisos.setOnClickListener(this);

        //ListView
        botonListView = (Button) findViewById(R.id.btnListView);
        botonListView.setOnClickListener(this);

        //ListView Personalizado
        botonPersonalizado = (Button) findViewById(R.id.btnPersonalizado);
        botonPersonalizado.setOnClickListener(this);

        //WebView
        botonWebView = (Button) findViewById(R.id.btnWebView);
        botonWebView.setOnClickListener(this);

        //WebView con HTML
        botonWebHtml = (Button) findViewById(R.id.btnWebHtml);
        botonWebHtml.setOnClickListener(this);

        //Media Player
        botonMediaPlayer = (Button) findViewById(R.id.btnMediaPlayer);
        botonMediaPlayer.setOnClickListener(this);

        //Table Layout
        botonTableLayout =(Button) findViewById(R.id.btnTableLayout);
        botonTableLayout.setOnClickListener(this);

        //TextWatcher
        botonTextWatcher = (Button) findViewById(R.id.btnTextWatcher);
        botonTextWatcher.setOnClickListener(this);

        //Autocompleted2
        botonAutocompleted2 = (Button) findViewById(R.id.btnAutocompleted2);
        botonAutocompleted2.setOnClickListener(this);

    } //nos dice quien es el XML de nuestra actividad

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
                Intent intent = new Intent(this, Main2Activity.class);
                String dato = edit.getText().toString();
                intent.putExtra("dato", dato);
                startActivity(intent);
                //usamos intent cuando vamos a enviar pocos datos

                //USANDO BUNDLE
                Bundle bundle = new Bundle();
                bundle.putString("nombre","Alfredo");
                bundle.putInt("id", 10);
                bundle.putFloat("float", 5);

                bundle.putBundle("bundle", bundle);

                //usamos bundle para enviar una mayor cantidad de datos
                break;

            case R.id.bradiobuton:
                Intent intent1 = new Intent(this, Main3Activity.class);
                startActivity(intent1);
                break;
            case R.id.btnSpinner:
                Intent intent2 = new Intent(this, MainSpinnerActivity.class);
                startActivity(intent2);
                break;
            case R.id.btntoggle:
                Intent intent3 = new Intent(this, MainToggleActivity.class);
                startActivity(intent3);
                break;
            case R.id.btnScrollView:
                Intent intent4 = new Intent(this, MainScrollViewActivity.class);
                startActivity(intent4);
                break;
            case R.id.btnHorizontalScrollView:
                Intent intent5 = new Intent(this, MainHorizontalScrollViewActivity.class);
                startActivity(intent5);
                break;
            case R.id.btncuadrodialogo:
                Intent intent6 = new Intent(this, MainCuadroDialogoActivity.class);
                startActivity(intent6);
                break;
            case R.id.btndialogimage:
                Intent intent7 = new Intent(this, MainDialogImageActivity.class);
                startActivity(intent7);
                break;
            case R.id.btnCheckBox:
                Intent intent8 = new Intent(this, MainCheckBoxActivity.class);
                startActivity(intent8);
                break;
            case R.id.btnAutocompleted:
                Intent intent9 = new Intent(this, MainAutocompletedTVActivity.class);
                startActivity(intent9);
                break;
            case R.id.btnHorizontal:
                Intent intent10 = new Intent(this, MainHorizontalActivity.class);
                startActivity(intent10);
                break;
            case R.id.btnVertical:
                Intent intent11 = new Intent(this, MainVerticalActivity.class);
                startActivity(intent11);
                break;
            case R.id.btnPermisos:
                Intent intent12 = new Intent(this, MainPermisosActivity.class);
                startActivity(intent12);
                break;
            case R.id.btnListView:
                Intent intent13 = new Intent(this, MainListViewActivity.class);
                startActivity(intent13);
                break;
            case R.id.btnPersonalizado:
                Intent intent14 = new Intent(this, MainListViewCustomActivity.class);
                startActivity(intent14);
                break;
            case R.id.btnWebView:
                Intent intent15 = new Intent(this, MainWebViewActivity.class);
                startActivity(intent15);
                break;
            case R.id.btnWebHtml:
                Intent intent16 = new Intent(this, MainWebHtmlActivity.class);
                startActivity(intent16);
                break;
            case R.id.btnMediaPlayer:
                Intent intent17 = new Intent(this, MainMediaPlayerActivity.class);
                startActivity(intent17);
                break;
            case R.id.btnTableLayout:
                Intent intent18 = new Intent(this, MainTableLayoutActivity.class);
                startActivity(intent18);
                break;
            case R.id.btnTextWatcher:
                Intent intent19 = new Intent(this, MainTextWatcherActivity.class);
                startActivity(intent19);
                break;
            case R.id.btnAutocompleted2:
                Intent intent20 = new Intent(this, MainAutocompletedTV2Activity.class);
                startActivity(intent20);
                break;
            default:
                break;
        }
    }
}
