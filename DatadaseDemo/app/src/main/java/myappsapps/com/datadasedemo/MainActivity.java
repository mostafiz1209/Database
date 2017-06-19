package myappsapps.com.datadasedemo;

import android.content.SharedPreferences;
import android.database.sqlite.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button button;

    SQLiteDatabaseDemoApps sqLiteDatabased;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Registration

        editText1=(EditText)findViewById(R.id.et1);
        editText2=(EditText)findViewById(R.id.et2);
        editText3=(EditText)findViewById(R.id.et3);
        button=(Button)findViewById(R.id.btn);
        sqLiteDatabased=new SQLiteDatabaseDemoApps(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               boolean cheaker= sqLiteDatabased.addData(editText1.getText().toString(),editText2.getText().toString(),editText3.getText().toString());
                if(cheaker==true)
                    Toast.makeText(MainActivity.this,"Data inserted successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data not inserted",Toast.LENGTH_LONG).show();




            }
        });



    }
}
