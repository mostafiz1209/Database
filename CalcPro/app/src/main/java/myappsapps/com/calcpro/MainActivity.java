package myappsapps.com.calcpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2, et3, et4;
    private Button btn1, btn2, btn3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        tv = (TextView) findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double n3 = Double.parseDouble(et3.getText().toString());
                double n4 = Double.parseDouble(et4.getText().toString());
                double result = n1 + n2 + n3 + n4;
                tv.setText("The summation is: " + result);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double n3 = Double.parseDouble(et3.getText().toString());
                double n4 = Double.parseDouble(et4.getText().toString());
                double result = n1 * n2 * n3 * n4;
                tv.setText("The multiplication is: " + result);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double n3 = Double.parseDouble(et3.getText().toString());
                double n4 = Double.parseDouble(et4.getText().toString());
                double result = (n1 + n2 + n3 + n4) / 4;
                tv.setText("The average is: " + result);
            }
        });
    }
}
