package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainMenuActivity extends AppCompatActivity {
    
    @BindView(R.id.menuBtn) Button btnRegresar;
    @OnClick(R.id.menuBtn)
    public void regresar(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.opcion1:
                Toast.makeText(MainMenuActivity.this, "Item 01", Toast.LENGTH_SHORT).show();   
                return true;
            case R.id.opcion2:
                Toast.makeText(MainMenuActivity.this, "Item 02", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(MainMenuActivity.this, "Item 03", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
