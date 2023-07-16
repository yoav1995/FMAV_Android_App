package com.example.final_app_fmav.Utilities;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.final_app_fmav.R;

public class SingleGen {
    public static SingleGen instance;
    private static MediaPlayer mediaPlayer;
    private Context context;

    private SingleGen(Context context) {
        this.context = context;
    }
    public static void init(Context context) {
        if (instance == null) {
            instance = new SingleGen(context);
        }

    }

    public static SingleGen getInstance() {
        return instance;
    }

    public void mediaPlayerOff()
    {
        mediaPlayer.pause();
    }
    public void mediaPlayerOn()
    {
        mediaPlayer.start();
    }

    public void mediaPlayerRelease()
    {
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    public void mediaPlayerInit()
    {
        //starting background sound. as default music is on
        mediaPlayer = MediaPlayer.create(context, R.raw.drive);
        mediaPlayer.setVolume(1f,1f);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    public boolean mediaPlayerIsPlaying()
    {
       if(mediaPlayer.isPlaying())
           return true;
       return false;
    }
}
