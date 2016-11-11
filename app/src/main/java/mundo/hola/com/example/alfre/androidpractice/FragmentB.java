package mundo.hola.com.example.alfre.androidpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alfre on 11/11/2016.
 */
public class FragmentB extends Fragment{
    TextView textView;
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        rootView = inflater.inflate(R.layout.fragmentb, container, false);
        textView =(TextView) rootView.findViewById(R.id.outputFragment);
        return rootView;
    }

    public void recibir(String msg){
        textView.setText(msg);
    }

}
