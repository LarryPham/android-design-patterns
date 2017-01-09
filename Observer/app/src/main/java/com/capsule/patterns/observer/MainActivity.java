package com.capsule.patterns.observer;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Sandwich mSandwich = new Sandwich();
    private Order mOrder = new Order(mSandwich);

    private int mNotificationId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button saveButton = (Button) findViewById(R.id.save_button);
        Button updateButton = (Button) findViewById(R.id.update_button);

        saveButton.setOnClickListener(this);
        updateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_button: {
                mSandwich.register(mOrder);
                sendNotification(mOrder.update());
                break;
            }
            case R.id.update_button: {
                mSandwich.setReady(true);
                sendNotification(mOrder.update());
                break;
            }
        }
    }

    private void sendNotification(String message) {
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_account_circle_blue_grey_50_24dp)
                .setContentTitle("Sandwich Factory")
                .setContentText(message);
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(mNotificationId, builder.build());
        mNotificationId++;
    }
}
