package myappsapps.com.androidcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    String[] names = {"Hi", "You", "Hello", "Bye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.textv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }

    public void onCreateContextMenu(ContextMenu c, View v, ContextMenu.ContextMenuInfo i) {
        c.setHeaderTitle("Select any one");
        c.add(0, v.getId(), 0, "Kmn aso???");
        c.add(0, v.getId(), 0, "tmi ki shei ager mto aso ???");
    }

    public boolean onContextItemSelected(MenuItem m) {
        if (m.getTitle() == "Kmn aso???") {
            Toast.makeText(getApplicationContext(), "vlo asi", Toast.LENGTH_LONG).show();
        } else if (m.getTitle() == "tmi ki shei ager mto aso ???") {
            Toast.makeText(getApplicationContext(), "ha, ame shei ager motoi asi", Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
    }


}
