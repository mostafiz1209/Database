package myappsapps.com.calculatorassignment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    EditText et1, et2;
    TextView tv;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        tv = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String s1 = et1.getText().toString();
                    String s2 = et2.getText().toString();
                if (s1.equals("") && s2.equals("")  )
                {
                    et1.setError("Please set first number");
                }else
                {
                    Toast.makeText(getApplicationContext(),"It's working",Toast.LENGTH_LONG).show();
                double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 + str2;
                    tv.setText("Number 1 + Number 2 : " + res);
                }
            }
        });

        // For subtraction

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 - str2;
                    tv.setText("Number 1 - Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });


        // For muliplication

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 * str2;
                    tv.setText("Number 1 * Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });


        // For division

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 / str2;
                    tv.setText("Number 1 / Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });


        // For MR operation

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 + str2;
                    tv.setText("Number 1 - Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });

        // For M+ operation

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 + str2;
                    res = res + res;
                    tv.setText("Number 1 - Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });


        // For M- operation

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if (!et1.equals("") && !et2.equals("")) {
                    double str1 = Double.parseDouble(s1);
                    double str2 = Double.parseDouble(s2);
                    double res = str1 + str2;
                    tv.setText("Number 1 - Number 2 : " + res);

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert number", Toast.LENGTH_LONG).show();
                }
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://myappsapps.com.calculatorassignment/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://myappsapps.com.calculatorassignment/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
