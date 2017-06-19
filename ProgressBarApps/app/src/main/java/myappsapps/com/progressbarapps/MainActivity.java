package myappsapps.com.progressbarapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.jar.JarEntry;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ProgressBar progressBar;
    private Button btn;
    private int progeressStatus=0;
   private android.os.Handler handler=new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv=(TextView)findViewById(R.id.textView);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progeressStatus=0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progeressStatus<100)
                        {
                            progeressStatus +=1;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progeressStatus);
                                    tv.setText("Prgress :"+progeressStatus+"/"+progressBar.getMax());
                                }
                            });
                            try{
                                Thread.sleep(100);
                            }catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

            }
        });
    }

}
