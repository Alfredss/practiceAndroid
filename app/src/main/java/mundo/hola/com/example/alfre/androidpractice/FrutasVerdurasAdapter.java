package mundo.hola.com.example.alfre.androidpractice;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by alfre on 04/11/2016.
 */
public class FrutasVerdurasAdapter extends ArrayAdapter<FrutasVerduras>{
    Context mycontext;
    int mylayoutResourceID;
    FrutasVerduras mydata[]=null;

    public FrutasVerdurasAdapter(Context context, int layoutResourceID, FrutasVerduras []data){
        super(context, layoutResourceID, data);
        this.mycontext = context;
        this.mylayoutResourceID = layoutResourceID;
        this.mydata = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        FrutasVerdurasHolder holder = null;

        if (row == null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row = inflater.inflate(mylayoutResourceID,parent,false);

            holder = new FrutasVerdurasHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.textView = (TextView) row.findViewById(R.id.txtItem);
            row.setTag(holder);
        }else{
            holder = (FrutasVerdurasHolder) row.getTag();
        }

        FrutasVerduras frutasVerduras = mydata[position];
        holder.textView.setText(frutasVerduras.title);
        holder.imagen.setImageResource(frutasVerduras.icon);

        return row;
    }


    static class FrutasVerdurasHolder {
        ImageView imagen;
        TextView textView;
    }
}
