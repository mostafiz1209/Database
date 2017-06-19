package myappsapps.com.listviewfun;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import myappsapps.com.listviewfun.R;

public class MainActivity extends ListActivity {

    String[] fruits = {"Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter aa=new ArrayAdapter<String>(this,R.layout.list_fruit,fruits);

        ListView listView = (ListView)findViewById(R.id.i);
        listView.setAdapter(aa);

    }

}