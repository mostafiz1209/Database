package myappsapps.com.widgetsprojects;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    TextView tv;
    RadioGroup rg;
    Switch sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        sw = (Switch) findViewById(R.id.switch1);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);


        sw.setOnCheckedChangeListener(sli);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n = rg.getCheckedRadioButtonId();
                switch (n) {
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "This is University of Rajshahi", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "This is University of Dhaka", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "This is Jahangirnagar University", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(), "This is BUET", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "This is nothing", Toast.LENGTH_LONG).show();
                        break;


                }


            }
        });


    }

    OnCheckedChangeListener sli = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked)
                Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();

        }
    };
}