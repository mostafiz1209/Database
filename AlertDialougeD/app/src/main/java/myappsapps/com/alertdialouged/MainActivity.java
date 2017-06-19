package myappsapps.com.alertdialouged;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Caution !!!");
                builder.setMessage("This is blocked site");
                builder.setIcon(R.drawable.icce);


                builder.setPositiveButton("Yes you can go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You should go", Toast.LENGTH_SHORT).show();

                    }
                });



                builder.setNegativeButton("No you cann't go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You shouldn't go", Toast.LENGTH_SHORT).show();

                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }
        });


    }
}
