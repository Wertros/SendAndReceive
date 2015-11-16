package com.example.adam.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Adam on 2015-11-12.
 */
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("wiadomosc");
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();

        Log.d("Receiver", "message received");
    }
}
