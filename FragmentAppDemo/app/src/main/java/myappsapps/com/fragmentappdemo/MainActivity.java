package myappsapps.com.fragmentappdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout my_tl;
    private ViewPager my_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_tl=(TabLayout)findViewById(R.id.my_tabs);
        my_vp=(ViewPager)findViewById(R.id.my_view_pager);



    }
}
