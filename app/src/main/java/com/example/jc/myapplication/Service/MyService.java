package com.example.jc.myapplication.Service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.orhanobut.logger.Logger;

import java.io.FileDescriptor;

/**
 * Created by jc on 2017/7/21.
 */

public class MyService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
        Logger.i(" onCreate");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Logger.i(" onBind");
        return new MyBinder();
    }


    public class MyBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }
    }

    public MyService() {
        super();
        Logger.i(" MyService");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logger.i(" onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Logger.e(" onDestroy");
        super.onDestroy();
    }


    @Override
    public boolean onUnbind(Intent intent) {
        Logger.i(" onUnbind");
        return super.onUnbind(intent);

    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Logger.i(" onRebind");
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        Logger.i(" onTaskRemoved");
    }

    public String getString() {
        return "MyServiceTest";
    }


}
