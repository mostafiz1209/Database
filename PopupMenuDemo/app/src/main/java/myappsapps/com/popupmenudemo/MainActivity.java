package myappsapps.com.popupmenudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.b);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu=new PopupMenu(getApplicationContext(),v);
                popupMenu.inflate(R.menu.popup_demo);
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch(item.getItemId())
                        {
                            case R.id.item1:
                                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                                break;
                            case R.id.item2:
                                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                                break;
                            case R.id.item3:
                                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                                break;
                            case R.id.item4:
                                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                                break;
                        }


                        return true;
                    }
                });



            }
        });


    }
}
