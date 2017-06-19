package myappsapps.com.notificationappsss;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    Button b;
    public static final int id = 1009;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notification = new NotificationCompat.Builder(this);
        b = (Button) findViewById(R.id.save);




        //-------- Notification code here -----


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                notification.setSmallIcon(R.drawable.icce);
                notification.setContentText("This is my first notification");
                notification.setContentTitle("Notificaiton Bar");
                notification.setWhen(System.currentTimeMillis());

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(MainActivity.this);
                taskStackBuilder.addParentStack(MainActivity.class);
                taskStackBuilder.addNextIntent(intent);
                PendingIntent pi = taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
                notification.setContentIntent(pi);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(id, notification.build());


            }
        }




    }

}