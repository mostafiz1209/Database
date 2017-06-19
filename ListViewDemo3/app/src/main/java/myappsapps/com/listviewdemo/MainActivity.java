package myappsapps.com.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);
        tv=(TextView)findViewById(R.id.imagetv);

        String[] strings={"Hi","Hello","To","From"};
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.lvlayout,R.id.imagetv,strings);
        lv.setAdapter(adapter);

    }
}
