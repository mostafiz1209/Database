package myappsapps.com.activitystates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toastThis((++count)+": Created");
        setContentView(R.layout.activity_main);
    }


    protected void onStart()
    {

        super.onStart();
        toastThis((++count)+": Started");
    }
    protected void onResume()
    {

         super.onResume();
        toastThis((++count)+": Resumed");
    }

    protected void onPause()
    {
        super.onPause();
        toastThis((++count)+": Paused");

    }
    protected void onStop()
    {

        super.onStop();
        toastThis((++count)+": Stopped");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        toastThis((++count)+": Destroyed");

    }
    protected void onRestart()
    {
        super.onRestart();
        toastThis((++count)+": Restarted");

    }

   protected void toastThis(String message)
    {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }



}
