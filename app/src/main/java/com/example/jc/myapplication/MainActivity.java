package com.example.jc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.state:
                goTo(com.example.jc.myapplication.strategy.TestActivity.class);
                break;
            case R.id.command:
                goTo(com.example.jc.myapplication.command.DrawActivity.class);
                break;
            case R.id.observer:
                goTo(com.example.jc.myapplication.observer.ObserverActivity.class);
                break;
            case R.id.strategy:
                goTo(com.example.jc.myapplication.strategy.TestActivity.class);
                break;
            default:
                break;
        }
    }


    private void goTo(Class cls) {
        startActivity(new Intent(this, cls));
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }
}
