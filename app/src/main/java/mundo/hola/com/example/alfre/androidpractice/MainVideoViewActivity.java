package mundo.hola.com.example.alfre.androidpractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainVideoViewActivity extends AppCompatActivity {
    @BindView(R.id.videoBtn) Button vvVideo;
    @OnClick(R.id.videoBtn)
    public void regresar(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video_view);
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
        videoView = (VideoView) findViewById(R.id.vvVideo);

        //primera forma de agregar video mediante una Url de Internet
        /*
        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();*/

        //Segunda forma haciendo uso del path
        String path = "android.resource://"+getPackageName()+"/"+R.raw.small;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }

}
