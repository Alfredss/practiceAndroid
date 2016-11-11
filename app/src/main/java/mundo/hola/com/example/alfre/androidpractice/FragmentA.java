package mundo.hola.com.example.alfre.androidpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by alfre on 10/11/2016.
 */
public class FragmentA extends Fragment{
    View rootView;
    EditText editText;
    Button button;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        rootView = inflater.inflate(R.layout.fragmenta, container, false);

        editText = (EditText) rootView.findViewById(R.id.inputFragment);
        button = (Button) rootView.findViewById(R.id.btnEnviaDato);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = editText.getText().toString();
            }
        });

        return rootView;

    }

}
