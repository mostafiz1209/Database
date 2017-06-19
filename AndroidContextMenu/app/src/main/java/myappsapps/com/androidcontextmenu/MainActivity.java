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
    String contacts[] = {"Robin", "Mostafiz", "Amit", "Jallu", "Faruk"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        {
            super.onCreateContextMenu(menu, v, menuInfo);
            menu.setHeaderTitle("Select The Action");
            menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title
            menu.add(0, v.getId(), 0, "SMS");


        }
    }

         public boolean onContextItemSelected(MenuItem item){
                         if(item.getTitle()=="Call"){
                                 Toast.makeText(getApplicationContext(), "you are calling code maaan", Toast.LENGTH_LONG).show();
                             }
                         else if(item.getTitle()=="SMS"){
                                 Toast.makeText(getApplicationContext(),"you are sending sms code maaaan",Toast.LENGTH_LONG).show();
                             }else{
                                return false;
                             }
                       return true;
                   }
             }

