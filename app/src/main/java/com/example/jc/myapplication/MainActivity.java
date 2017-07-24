package com.example.jc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.jc.myapplication.AbstractFactory.AbstractFactoryActivity;
import com.example.jc.myapplication.Adapter.AdapterActivity;
import com.example.jc.myapplication.Builder.BuilderActivity;
import com.example.jc.myapplication.Observer.ObserverActivity;
import com.example.jc.myapplication.Service.ServiceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
//                startActivity(new Intent(this, AbstractFactoryActivity.class));
//                startActivity(new Intent(this, BuilderActivity.class));
//                startActivity(new Intent(this, AdapterActivity.class));
//                startActivity(new Intent(this, ServiceActivity.class));
                startActivity(new Intent(this, ObserverActivity.class));
                break;
        }
    }


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }


}
