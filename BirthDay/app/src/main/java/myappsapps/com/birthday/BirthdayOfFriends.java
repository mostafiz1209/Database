package myappsapps.com.birthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mostafiz-pc on 3/12/2017.
 */
public class BirthdayOfFriends extends AppCompatActivity {
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_of_friends);

        tv=(TextView)findViewById(R.id.tv);

        MyDBFunctions mf=new MyDBFunctions(getApplicationContext());
        String[] data=mf.my_data();
        tv.setText(data[0]);
    }
}