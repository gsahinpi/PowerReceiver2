package com.example.powerreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String intentAction = intent.getAction();
        if (intentAction != null) {
            String toastMessage = "unknown intent action";
            switch (intentAction) {
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power connected!";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power disconnected!";
                    break;
                case com.example.powerreceiver2.MainActivity.ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Custom Broadcast!";
                    break;
            }//switch
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }//if



        }//onrecieve
}
