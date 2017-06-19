package myappsapps.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText=(EditText)findViewById(R.id.et1);
    EditText editText1=(EditText)findViewById(R.id.et2);
    TextView textView=(TextView)findViewById(R.id.tv1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickedOperation();
    }

    private void buttonClickedOperation() {

        Button button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double s1=Double.parseDouble(editText1.getText().toString());
                double s2=Double.parseDouble(editText1.getText().toString());
                double res=s1+s2;
                textView.setText(""+res);
            }
        });
    }
}
