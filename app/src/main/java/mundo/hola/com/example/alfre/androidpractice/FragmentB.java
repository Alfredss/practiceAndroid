package mundo.hola.com.example.alfre.androidpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alfre on 11/11/2016.
 */
public class FragmentB extends Fragment{
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        rootView = inflater.inflate(R.layout.fragmentb, container, false);
        return rootView;
    }

}
