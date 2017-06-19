package myappsapps.com.customalertdialogdemo;

import android.app.Dialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Alert");
                dialog.setContentView(R.layout.custom_alertdialog_layour);
                dialog.show();

                final EditText et = (EditText)dialog.findViewById(R.id.editText);
                Button b1 = (Button)dialog.findViewById(R.id.button1);
                Button b2 = (Button)dialog.findViewById(R.id.button2);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String str = et.getText().toString();
                        Toast.makeText(getApplicationContext(), "Tne code is : " + str, Toast.LENGTH_LONG).show();
                        dialog.cancel();


                    }
                });


                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });


            }
        });


    }
}
