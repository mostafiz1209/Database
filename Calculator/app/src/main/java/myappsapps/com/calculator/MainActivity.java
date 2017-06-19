package myappsapps.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et11, et22;
    Button btn1;
    TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et11 = (EditText) findViewById(R.id.et1);
        et22 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btn);
        tv11 = (TextView) findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d=Integer.parseInt(et11.getText().toString());
                int r = Integer.parseInt(et11.getText().toString());
                int result=d+r;

                tv11.setText(result);



            //Toast.makeText(getApplicationContext(),"Impossible",Toast.LENGTH_LONG).show();
            }

        });



    }


}
