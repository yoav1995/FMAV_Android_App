package com.example.final_app_fmav;

import android.app.Application;

import com.example.final_app_fmav.Utilities.ImageLoader;
import com.google.firebase.ktx.Firebase;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.initImageLoader(this);
    }


}
