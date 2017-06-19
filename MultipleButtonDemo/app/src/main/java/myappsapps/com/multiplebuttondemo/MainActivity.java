package myappsapps.com.multiplebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {

            case R.id.b1:
                Toast.makeText(getApplicationContext(),"B1",Toast.LENGTH_LONG).show();
                break;
            case R.id.b2:
                Toast.makeText(getApplicationContext(),"B2",Toast.LENGTH_LONG).show();
                break;
            case R.id.b3:
                Toast.makeText(getApplicationContext(),"B3",Toast.LENGTH_LONG).show();
                break;
            case R.id.b4:
                Toast.makeText(getApplicationContext(),"B4",Toast.LENGTH_LONG).show();
                break;
        }


    }
}
