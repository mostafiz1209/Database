package myappsapps.com.valuepassnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput=(EditText) findViewById(R.id.etInput);
    }
    public void submit(View v)
    {
        String inputString=etInput.getText().toString();
        Intent intents =new Intent(this,AnotherActivity.class);
        intents.putExtra("input",inputString);
        startActivity(intents);

    }
}
