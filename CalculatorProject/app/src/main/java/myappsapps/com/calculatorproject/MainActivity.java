package myappsapps.com.calculatorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editT1, editT2;
    Button btn1, btn2, btn3, btn4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editT1 = (EditText) findViewById(R.id.et1);
        editT2 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btnPlus);
        btn2 = (Button) findViewById(R.id.btnMinus);
        btn3 = (Button) findViewById(R.id.btnMult);
        btn4 = (Button) findViewById(R.id.btnDiv);
        textView = (TextView) findViewById(R.id.tvOutput);


        //  For Addition
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editT1.getText().toString();
                String str2 = editT2.getText().toString();

                if (!str1.equals("") && !str2.equals("")) {

                    Double d1 = Double.parseDouble(str1);
                    Double d2 = Double.parseDouble(str2);
                    Double result = d1 + d2;
                    textView.setText(""+result);

                } else {
                    Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
            }
        });

        //For Subtraction
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editT1.getText().toString();
                String str2 = editT2.getText().toString();
                if (!str1.equals("") && !str2.equals("")) {
                    Double d1 = Double.parseDouble(str1);
                    Double d2 = Double.parseDouble(str2);
                    Double result = d1 - d2;
                    textView.setText(""+result);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
            }
        });


        //For Multiplication
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editT1.getText().toString();
                String str2 = editT2.getText().toString();
                if (!str1.equals("") && !str2.equals("")) {
                    Double d1 = Double.parseDouble(str1);
                    Double d2 = Double.parseDouble(str2);
                    Double result = d1 * d2;
                    textView.setText(""+result);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
            }
        });


        //For Division
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String str1 = editT1.getText().toString();
                    String str2 = editT2.getText().toString();


                        Double d1 = Double.parseDouble(str1);
                        Double d2 = Double.parseDouble(str2);

                        Double result = d1 / d2;
                    if(d2==0)
                    {
                        Toast.makeText(getApplicationContext(), "Zero is not valid", Toast.LENGTH_LONG).show();
                    }
                        //textView.setText("" + result);

                }
                catch(ArithmeticException e)
                {
                    Toast.makeText(getApplicationContext(), "Zero is not valid", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
