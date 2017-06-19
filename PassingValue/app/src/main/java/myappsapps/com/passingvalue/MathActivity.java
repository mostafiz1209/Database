package myappsapps.com.passingvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MathActivity extends AppCompatActivity {

    TextView txv1,txv2,txv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        txv1=(TextView)findViewById(R.id.tv1);
        txv2=(TextView)findViewById(R.id.tv2);
        txv3=(TextView)findViewById(R.id.tv3);

        Intent intent=this.getIntent();
        String st1=intent.getStringExtra("fname");
        String st2=intent.getStringExtra("lname");
        String st3=intent.getStringExtra("email");

        txv1.setText(st1);
        txv2.setText(st2);
        txv3.setText(st3);


    }
}
