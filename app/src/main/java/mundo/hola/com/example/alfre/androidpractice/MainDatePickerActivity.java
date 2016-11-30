package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainDatePickerActivity extends AppCompatActivity {
    @BindView(R.id.dateBtn) Button btnRegresar;
    @OnClick(R.id.dateBtn)
    public void regresar(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    Button button;
    DatePicker datePicker;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_date_picker);
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
        textView = (TextView) findViewById(R.id.tvFecha);
        button = (Button) findViewById(R.id.btnEnviarFecha);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+"-"+datePicker.getYear());
            }
        });
        datePicker = (DatePicker) findViewById(R.id.dpPicker);


    }

}
