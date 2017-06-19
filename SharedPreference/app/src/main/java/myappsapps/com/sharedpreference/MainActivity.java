package myappsapps.com.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1,btn2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        tv=(TextView)findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp=getSharedPreferences("userInfo", Context.MODE_PRIVATE);

                SharedPreferences.Editor e=sp.edit();
                e.putString("username",et1.getText().toString());
                e.putString("password",et2.getText().toString());
                e.apply();
                tv.setText(et1.getText().toString()+" and "+et2.getText().toString());
                Toast.makeText(getApplicationContext(),"Saved data",Toast.LENGTH_LONG).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences spp=getSharedPreferences("userInfo",Context.MODE_PRIVATE);
                String s1=spp.getString("username", "");
                String s2=spp.getString("password","");
                tv.setText(s1+" and "+s2);
                //Toast.makeText(getApplicationContext(),s1+"  "+s2,Toast.LENGTH_LONG).show();


            }
        });

    }
}
