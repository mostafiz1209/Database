package myappsapps.com.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.mm, R.drawable.n, R.drawable.o,
            R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gv);

        ImageAdapter imageAdapter = new ImageAdapter();
        gridView.setAdapter(imageAdapter);


    }


    class ImageAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
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

            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setImageResource(images[position]);

            return imageView;
        }
    }


}
