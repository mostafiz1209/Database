package myappsapps.com.customadapterdemotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int image[] = {R.drawable.aa, R.drawable.bb};
    String names[] = {"Robin", "Mostafiz"};
    String description[] = {"Vlo sele", "Good boy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        CustomAdapterDemoReBaba cs=new CustomAdapterDemoReBaba();
        listView.setAdapter(cs);




    }

    class CustomAdapterDemoReBaba extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View v = getLayoutInflater().inflate(R.layout.custom_adapter, null);

            ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
            TextView tv_names = (TextView) v.findViewById(R.id.tv_names);
            TextView tv_description = (TextView) v.findViewById(R.id.tv_description);


            imageView.setImageResource(image[position]);
            tv_names.setText(names[position]);
            tv_description.setText(description[position]);


            return v;
        }
    }


}
