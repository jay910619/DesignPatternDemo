package com.example.jc.myapplication.observer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.jc.myapplication.R;

//具体观察者1
public class ObserverActivity extends AppCompatActivity implements LoginObserver, View.OnClickListener {

    TextView account, pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        account = (TextView) findViewById(R.id.account);
        pwd = (TextView) findViewById(R.id.pwd);

        findViewById(R.id.bt_login).setOnClickListener(this);

        ConcreteLogin.getInstance().register(this);

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
        //用户退出  UI变动
        account.setText("");
        pwd.setText("");
        //对用户数据的处理  ...
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login:
                Intent intent = new Intent();
//                Bundle bundle = new Bundle();
//                bundle.putString("username", "11");
//                bundle.putString("pwd", "pwd");
                intent.setClass(this, ObserverActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
