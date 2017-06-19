package myappsapps.com.valuepassnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    public TextView tuOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        tuOutput = (TextView) findViewById(R.id.tvOutput);
        String str=getIntent().getStringExtra("input");
        EditText tvOutput;
        tuOutput.setText(str);
    }
}
