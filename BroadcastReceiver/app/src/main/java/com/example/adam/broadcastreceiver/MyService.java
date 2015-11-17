package com.example.adam.broadcastreceiver;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/**
 * Created by Adam on 2015-11-16.
 */
public class MyService extends IntentService{

    MyReceiver myReceiver;

    public MyService() {
        super("MyService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        myReceiver = new MyReceiver();
        IntentFilter itf = new IntentFilter("com.example.adam.MESSAGE");

        getBaseContext().registerReceiver(myReceiver, itf);

        Log.d("service", "handling intent...");

    }
}
