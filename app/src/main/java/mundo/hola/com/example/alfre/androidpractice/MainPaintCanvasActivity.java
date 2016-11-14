package mundo.hola.com.example.alfre.androidpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

public class MainPaintCanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);

    }

    class Vista extends View{
        float x=50;
        float y=50;
        String accion = "action";
        Path path = new Path();

        public Vista(Context context){
            super(context);
        }

        //@Override
        protected void onDraw(Canvas canvas){
            //super.onDraw(canvas);
            /*
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            paint.setColor(Color.BLUE);
            canvas.drawRect(20,20,canvas.getWidth()-50,70,paint);
            */

            //Dibujar un circulo
            /*
            int x = getWidth();
            int y = getHeight();
            int radius;
            radius = 100;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor("#CD5C5C"));
            canvas.drawCircle(x / 2, y / 2, radius, paint);
            */

            //Dibujar en la pantalla
            Paint paint = new Paint();

            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            paint.setColor(Color.BLACK);

            if (accion == "down")
                path.moveTo(x,y);
            if (accion == "move")
                path.lineTo(x,y);
            
            canvas.drawPath(path, paint);
        }

        //metodo que devuelve las coordenadas y la accion para dibujar en la pantalla
        public boolean onTouchEvent(MotionEvent e){
            x = e.getX();
            y = e.getY();

            if (e.getAction()==MotionEvent.ACTION_DOWN)
                accion = "down";
            if (e.getAction()==MotionEvent.ACTION_MOVE)
                accion = "move";

            invalidate();
            return true;
        }
    }

}
