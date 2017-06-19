package myappsapps.com.fragmentapps;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFragment1,btnFragment2,btnFragment3;
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1=(Button)findViewById(R.id.btn1);
        btnFragment2=(Button)findViewById(R.id.btn2);
        btnFragment3=(Button)findViewById(R.id.btn3);

        btnFragment1.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);
        btnFragment3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int id=v.getId();

        if(id==R.id.btn1)
        {
            fragment=new Fragment1();
        }
        else if(id==R.id.btn2)
        {
            fragment=new Fragment2();

        }

        else if(id==R.id.btn3)
        {
            fragment=new Fragment3();
        }
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.myFragment,fragment);
        fragmentTransaction.commit();



    }
}
