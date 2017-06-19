package myappsapps.com.optionmenuproject;

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

    public boolean onCreateOptinosMenu(Menu menu)

    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Item One selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Item Two selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Item Three selected heyyyyy", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.item4:
                Toast.makeText(getApplicationContext(), "Item Four selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5:
                Toast.makeText(getApplicationContext(), "Item Five selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item6:
                Toast.makeText(getApplicationContext(), "Item Six selected heyyyyy", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item7:
                Toast.makeText(getApplicationContext(), "Item Seven selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item8:
                Toast.makeText(getApplicationContext(), "Item Eight selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item9:
                Toast.makeText(getApplicationContext(), "Item Nine selected heyyyyy", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item10:
                Toast.makeText(getApplicationContext(), "Item Ten selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item11:
                Toast.makeText(getApplicationContext(), "Item Eleven selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item12:
                Toast.makeText(getApplicationContext(), "Item Twelve selected heyyyyy", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
