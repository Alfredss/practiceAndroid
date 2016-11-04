package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainListViewCustomActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view_custom);
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
        listView = (ListView) findViewById(R.id.lvcustom);


        FrutasVerduras frutasVerduras []= new FrutasVerduras[]{
                new FrutasVerduras(R.drawable.ic_launcher,"Manzana"),
                new FrutasVerduras(R.drawable.ic_launcher,"Lechuga"),
                new FrutasVerduras(R.drawable.ic_launcher,"Melon"),
                new FrutasVerduras(R.drawable.ic_launcher,"Zanahoria"),
                new FrutasVerduras(R.drawable.ic_launcher,"Veterraga"),
        };

        FrutasVerdurasAdapter adapter = new FrutasVerdurasAdapter(this, R.layout.listview_item_row, frutasVerduras);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(R.id.txtItem);

                Toast.makeText(MainListViewCustomActivity.this, textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        boton = (Button) findViewById(R.id.lvpersonalizadobtn);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lvpersonalizadobtn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
