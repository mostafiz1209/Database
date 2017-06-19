package myappsapps.com.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] osList={"Mac osx","Windows","Linux","Unix","Ubuntu","Kernel"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter=new ArrayAdapter<String>(this, R.layout.list_item,R.id.tv,osList);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l,View v,int p,long id)

    {

        super.onListItemClick(l,v,p,id);
        Toast.makeText(getApplicationContext(),"Selected item :"+p+"\nItem name :"+osList[p],Toast.LENGTH_LONG).show();
    }
}
