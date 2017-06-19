package myappsapps.com.toastapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=(Button)findViewById(R.id.Button01);
        btn1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Another_Activity.class);
                intent.putExtra("Value", "Android By Javatpoint");
                intent.putExtra("Value2", "Simple Tutorial");
                startActivity(intent);
            }
        });
    }
}
