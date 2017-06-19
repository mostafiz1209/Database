package myappsapps.com.passingvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt1,edt2,edt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ssetupDoMathButton();

    }

    private void ssetupDoMathButton() {
        btn=(Button)findViewById(R.id.bt1);
        edt1=(EditText)findViewById(R.id.et1);
        edt2=(EditText)findViewById(R.id.et2);
        edt3=(EditText)findViewById(R.id.et3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MathActivity.class);
                intent.putExtra("fname",edt1.getText().toString());
                intent.putExtra("lname",edt2.getText().toString());
                intent.putExtra("email",edt3.getText().toString());
                startActivity(intent);

            }
        });

    }
}
