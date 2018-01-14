package com.example.christian.factorytest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Christian on 12/01/18.
 */

public class Receiver extends BroadcastReceiver {

    private screenOff callback;



    public Receiver(screenOff callback) {
        this.callback = callback;
    }

    public interface screenOff {
        void onscrennOff();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            callback.onscrennOff();
        }
    }
}
