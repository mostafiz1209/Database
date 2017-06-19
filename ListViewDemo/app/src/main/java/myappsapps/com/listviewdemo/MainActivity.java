package myappsapps.com.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewOperation();
    }

    private void listViewOperation() {

        String[] str={"Hi","Hello","Welcome","Bye","Good Night"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.my_layout,str);
        ListView lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
    }
}
