package myappsapps.com.widgetspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rrg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rrg=(RadioGroup) findViewById(R.id.rg);


        rrg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int c=rrg.getCheckedRadioButtonId();

                switch (checkedId)

                {
                    case R.id.radioButton1:
                        Toast.makeText(getApplicationContext(),"Hi",Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }
}
