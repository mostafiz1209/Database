package myappsapps.com.ontouchlistenerdemo;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout=null;
    private Button btn=null;
    private float x=0;
    private float y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=(RelativeLayout)findViewById(R.id.rl);
        btn=(Button)findViewById(R.id.btn);

        relativeLayout.setOnTouchListener(new View.OnTouchListener() {

            int i=0;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),"I am touched",Toast.LENGTH_LONG).show();

                x=event.getX();
                y=event.getY();

                if(event.getAction()==MotionEvent.ACTION_MOVE) {

                    btn.setX(x);
                    btn.setY(y);

                }
                if(++i>50)
                {
                    return false;
                }

                return true;
            }
        });

    }
}
