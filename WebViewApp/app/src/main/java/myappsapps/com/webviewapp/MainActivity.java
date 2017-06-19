package myappsapps.com.webviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv=(WebView)findViewById(R.id.wv);
        //wv.loadUrl("https://www.google.com");

        wv.loadUrl("http://<h2>Please click here</h2>");
    }
}
