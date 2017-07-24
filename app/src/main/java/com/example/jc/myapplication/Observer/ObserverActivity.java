package com.example.jc.myapplication.Observer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jc.myapplication.R;

//具体观察者1
public class ObserverActivity extends AppCompatActivity implements LoginObserver, View.OnClickListener {

    TextView textView1, textView2;
    ConcreteLogin concreteLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        textView1 = (TextView) findViewById(R.id.textView2);
        textView2 = (TextView) findViewById(R.id.textView3);

        findViewById(R.id.button2).setOnClickListener(this);


        concreteLogin = ConcreteLogin.getInstance();

        concreteLogin.register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        concreteLogin.unregister(this);
    }


    @Override
    public void login(UserBean loginBean) {
        //登录用户信息变动   UI做出相应调整
        textView1.setText("ObserverActivity:" + loginBean.getPassword());
        textView2.setText("ObserverActivity:" + loginBean.getUserName());
        //对用户数据做出相应处理  ...

    }

    @Override
    public void exit() {
        //用户退出  UI变动
        textView1.setText("");
        textView2.setText("");
        //对用户数据的处理  ...
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                startActivity(new Intent(this, ObserverActivity2.class));
                break;
        }
    }
}
