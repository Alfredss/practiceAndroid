package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainLinternaActivity extends AppCompatActivity {
    Button botonBrillar;
    Camera camera;

    @BindView(R.id.linternaBtn) Button salir;
    @OnClick(R.id.linternaBtn)
    public void regreasar(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linterna);
        ButterKnife.bind(this);

        botonBrillar = (Button) findViewById(R.id.btnBrillar);
        botonBrillar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera = Camera.open();
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(parameters);
                camera.startPreview();
            }
        });
    }

}
