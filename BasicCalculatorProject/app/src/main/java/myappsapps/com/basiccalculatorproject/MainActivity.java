package myappsapps.com.basiccalculatorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView4);


    }


    public void plus(View v) {
        int num1, num2, rslt;
        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());
        rslt = num1 + num2;
        tv.setText(Integer.toString(rslt));
    }

}
