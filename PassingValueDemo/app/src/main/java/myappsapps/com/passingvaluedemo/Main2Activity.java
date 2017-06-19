package myappsapps.com.passingvaluedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=(TextView)findViewById(R.id.tvu);
        tv2=(TextView)findViewById(R.id.tvp);

        String s1=getIntent().getStringExtra("username");
        String s2=getIntent().getStringExtra("password");
        tv1.setText(""+s1);
        tv2.setText(""+s2);
    }
}
