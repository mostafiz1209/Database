package myappsapps.com.projectnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    public void back(View v)
//    {
//        Intent intent=new Intent(this,Activity2.class);
//        startActivity(intent);
//    }

    public void second_Ac(View v)
    {
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);
    }

    public void third_Ac(View v)
    {
        Intent intent=new Intent(this,Activity3.class);
        startActivity(intent);
    }

}
