package com.example.jc.myapplication.Service;

import android.app.IntentService;
import android.content.Intent;

import com.orhanobut.logger.Logger;

/**
 * Created by jc on 2017/7/21.
 */

public class MIntentService extends IntentService {

    public MIntentService() {
        super("MIntentService");
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MIntentService(String name) {
        super(name);
    }

    @Override
    public void onCreate() {
        Logger.i("onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logger.i("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Logger.i("onHandleIntent" + "--" + intent.getStringExtra("info"));
    }

    @Override
    public void onDestroy() {
        Logger.e("onDestroy");
        super.onDestroy();
    }
}
