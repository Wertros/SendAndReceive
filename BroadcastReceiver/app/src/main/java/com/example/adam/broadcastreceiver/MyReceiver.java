package com.example.adam.broadcastreceiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Created by Adam on 2015-11-12.
 */
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("wiadomosc");
        Log.d("Receiver", "messege received");

        NotificationCompat.Builder ntfBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.message_icon)
                .setContentTitle("Message")
                .setContentText(message);

        int id = (int) System.currentTimeMillis();
        NotificationManager ntfManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

        ntfManager.notify(id, ntfBuilder.build());
    }

}
