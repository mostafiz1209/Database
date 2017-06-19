package myappsapps.com.androidmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id==R.id.op1)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }


        if(id==R.id.op2)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        if(id==R.id.op3)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);

        }

        if(id==R.id.op4)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        if(id==R.id.op5)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        if(id==R.id.op6)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }










        return true;
    }
}
