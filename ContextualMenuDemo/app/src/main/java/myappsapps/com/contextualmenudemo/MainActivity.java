package myappsapps.com.contextualmenudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.b);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActionMode(callback);

            }
        });


    }



    ActionMode.Callback callback= new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater menuInflater=mode.getMenuInflater();
            menuInflater.inflate(R.menu.contextual_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
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

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };



}
