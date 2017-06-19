package myappsapps.com.actionbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.menu_item, m);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem mi) {
        int id = mi.getItemId();

        if (id == R.id.hi) {
            Toast.makeText(getApplicationContext(),"Hi clicked",Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.hello) {

            Toast.makeText(getApplicationContext(),"Hello clicked",Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.bye) {

            Toast.makeText(getApplicationContext(),"Bye clicked",Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.good) {

            Toast.makeText(getApplicationContext(),"Good clicked",Toast.LENGTH_SHORT).show();
        }

        return true;
    }


}
