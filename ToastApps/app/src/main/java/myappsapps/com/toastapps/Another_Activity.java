package myappsapps.com.toastapps;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View.OnClickListener;

public class Another_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_);


        TextView tv = new TextView(this);
        tv.setText("second activity");
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(), "Values are:\n First value: " + value1 +
                "\n Second Value: " + value2, Toast.LENGTH_LONG).show();
        Button button1 = (Button) findViewById(R.id.Button01);
        button1.setOnClickListener(new OnClickListener() {
    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        }
        });
    }
}





