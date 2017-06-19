package myappsapps.com.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2, tv3;
    Button btn1;

    int countC=0,countR=0,countP=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialComponents();
        countC=countC+1;
        tv1.setText(countC+"");

        Log.d("Hi", "This is onCreate method");
    }

    private void initialComponents() {
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        btn1 = (Button) findViewById(R.id.button);
    }
    protected void onResume()
    {
        super.onResume();
        countR=countR+1;
        tv2.setText(countR+"");
        Log.d("Hi", "This is onResume method");
    }
    protected void onPsuse()
    {
        super.onPause();
        countP=countP+1;
        tv3.setText(countP+"");
        Log.d("Hi", "This is onPause method");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
                break;
        }
    }
}
