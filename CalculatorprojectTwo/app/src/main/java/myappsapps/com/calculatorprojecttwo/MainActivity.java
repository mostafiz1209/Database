package myappsapps.com.calculatorprojecttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickListenerMethod();
    }

    public void onClickListenerMethod() {
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1 = et1.getText().toString();
                String nm2 = et2.getText().toString();
                int number1 = Integer.parseInt(nm1);
                int number2 = Integer.parseInt(nm2);
                int sum = number1 + number2;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_SHORT).show();


            }
        });

    }


}
