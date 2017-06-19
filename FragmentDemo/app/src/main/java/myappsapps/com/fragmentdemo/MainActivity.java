package myappsapps.com.fragmentdemo;

import android.app.FragmentManager;
import android.hardware.fingerprint.FingerprintManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.FragmentA;
import layout.FragmentB;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    FragmentA fra=new FragmentA();
    FragmentB frb=new FragmentB();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragment,fra,"fragment");
                ft.commit();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragment,frb,"fragment");
                ft.commit();

            }
        });

    }
}
