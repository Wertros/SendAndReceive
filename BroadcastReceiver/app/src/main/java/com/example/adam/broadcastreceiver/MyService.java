package com.example.adam.broadcastreceiver;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Adam on 2015-11-16.
 */
public class MyService extends IntentService{

    MyReceiver myReceiver;
//
//    @Override
//    public void onCreate() {
//        try{
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    myReceiver = new MyReceiver();
//                }
//            });
//        }catch (IllegalThreadStateException e) {
//            e.printStackTrace();
//        }
//    }

//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }

    public MyService() {
        super("MyService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        myReceiver = new MyReceiver();

        Log.d("service", "handling intent...");
    }
}
