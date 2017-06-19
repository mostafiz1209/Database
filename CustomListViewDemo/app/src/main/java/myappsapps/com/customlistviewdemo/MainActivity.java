package myappsapps.com.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list=(ListView)findViewById(R.id.listView);

        ArrayList<Product> arrayList=new ArrayList<>();
        arrayList.add(new Product(1,"Robin",1233,"Hello"));
        arrayList.add(new Product(2, "Robin", 33, "Heo"));
        arrayList.add(new Product(3,"Robin",433,"Hel"));
        arrayList.add(new Product(4,"Robin",125,"lo"));
        arrayList.add(new Product(5,"Robin",33,"Hllo"));
        arrayList.add(new Product(6,"Robin",103,"ii"));

        ProductListAdapter productListAdapter=new ProductListAdapter(getApplicationContext(),arrayList);
        list.setAdapter(productListAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Position id : "+view.getTag(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
