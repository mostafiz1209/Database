package myappsapps.com.checkboxdemo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);

        c1.setOnCheckedChangeListener(this);
        c2.setOnCheckedChangeListener(this);


    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        if(isChecked)
        {
            Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_LONG).show();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_LONG).show();

        }
    }
}
