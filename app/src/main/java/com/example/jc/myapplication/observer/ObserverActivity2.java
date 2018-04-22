package com.example.jc.myapplication.observer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.jc.myapplication.R;


//具体观察者2
public class ObserverActivity2 extends AppCompatActivity implements LoginObserver, View.OnClickListener {
    TextView account, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer2);

        account = (TextView) findViewById(R.id.account);
        pwd = (TextView) findViewById(R.id.pwd);

        ConcreteLogin.getInstance().register(this);

        findViewById(R.id.bt_login).setOnClickListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConcreteLogin.getInstance().unregister(this);
    }


    @Override
    public void login(UserBean loginBean) {
        //登录用户信息变动   UI做出相应调整
        account.setText(loginBean.getPassword());
        pwd.setText(loginBean.getUserName());
        //对用户数据做出相应处理  ...
    }

    @Override
    public void exit() {
        account.setText("");
        pwd.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login:
                Intent intent = new Intent();
                intent.setClass(this, LoginControlActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
