package myappsapps.com.classpractice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bt1=(Button)findViewById(R.id.button1);
//        bt2=(Button)findViewById(R.id.button2);
//        bt3=(Button)findViewById(R.id.button3);
        initView();
        Intent intent1 = new Intent(this, Activity2.class);
        Intent intent2 = new Intent(this, Activity3.class);
        Intent intent3 = new Intent(this, Activity4.class);
//        startActivity(intent1);
//        startActivity(intent2);
//        startActivity(intent3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private void initView() {

        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);

    }

}

