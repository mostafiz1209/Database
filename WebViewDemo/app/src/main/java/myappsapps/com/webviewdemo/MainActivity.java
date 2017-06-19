package myappsapps.com.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.b);
        w=(WebView)findViewById(R.id.w);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w.setWebViewClient(new WebViewClient());
                w.loadUrl("https://www.google.com/" );
            }
        });


    }
}
