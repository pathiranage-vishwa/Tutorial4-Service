package com.example.labmad;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import static android.app.Service.START_STICKY;

public class MyServices extends Service {
    private MediaPlayer player;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MediaPlayer player = MediaPlayer.create(getApplicationContext(),R.raw.song);
        player.setLooping(true);
        player.start();
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
