package myappsapps.com.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.name);
        et2=(EditText)findViewById(R.id.bday);
        b=(Button)findViewById(R.id.save);

       final MyDBFunctions mdf=new MyDBFunctions(getApplicationContext());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _name=et1.getText().toString();
                String _bday=et2.getText().toString();
                DataTemp dt=new DataTemp(_name,_bday);
                mdf.addingDataToTable(dt);

                Toast.makeText(getApplicationContext(),"Data added successfully",Toast.LENGTH_LONG).show();
            }
        });
    }

}
