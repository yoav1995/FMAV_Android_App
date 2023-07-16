package com.example.final_app_fmav;

import android.app.Application;

import com.example.final_app_fmav.Utilities.ImageLoader;
import com.example.final_app_fmav.Utilities.SingleGen;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SingleGen.init(this);
        SingleGen.getInstance().mediaPlayerInit();
        ImageLoader.initImageLoader(this);;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SingleGen.getInstance().mediaPlayerRelease();
    }
}
