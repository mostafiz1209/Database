package myappsapps.com.sdcarddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    EditText etFilename,etText;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        etFilename=(EditText)findViewById(R.id.edittext);
        etText=(EditText)findViewById(R.id.edittext1);
        saveButton=(Button)findViewById(R.id.btn);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fileName=etFilename.getText().toString();


            }
        });
    }
}
