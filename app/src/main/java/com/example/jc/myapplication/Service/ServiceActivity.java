package com.example.jc.myapplication.Service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jc.myapplication.R;
import com.orhanobut.logger.Logger;

public class ServiceActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        text = (TextView) findViewById(R.id.textView);
        startService();
        startIntentService();
        bindService();
    }


    @Override
    protected void onDestroy() {
        Logger.i("onDestroy");
        super.onDestroy();
        unbindService(mConnection);
    }

    private void startService() {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    private void startIntentService() {
        Intent intent = new Intent(this, MIntentService.class);
        intent.putExtra("info", "good good study");
        startService(intent);
    }

    private void bindService() {
        Intent intent = new Intent(this, MyService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    }

    private MyService serviceRef;

    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            serviceRef = ((MyService.MyBinder) service).getService();
            text.setText(serviceRef.getString());
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            serviceRef = null;
        }
    };

}
