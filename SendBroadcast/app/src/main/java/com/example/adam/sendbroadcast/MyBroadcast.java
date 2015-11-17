package com.example.adam.sendbroadcast;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.widget.EditText;

public class MyBroadcast extends AppCompatActivity {

    private EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_broadcast);
    }

    public void onClickSendMessage(View view) {

        editMessage = new EditText(this);
        editMessage.setHint("Enter your massage...");

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle("Message");
        alertBuilder.setMessage("send message");
        alertBuilder.setView(editMessage);

        alertBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //send
                String message = editMessage.getText().toString();
                Intent intent = new Intent("com.example.adam.MESSAGE");
                intent.putExtra("wiadomosc", message);

                sendBroadcast(intent);
        }
        });
        alertBuilder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();

        Log.d("button", "clicked");
    }

}
