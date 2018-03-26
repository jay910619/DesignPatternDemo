package com.example.jc.myapplication.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jc.myapplication.R;

//具体观察者2
public class ObserverActivity2 extends AppCompatActivity implements LoginObserver, View.OnClickListener {
    TextView textView1, textView2;
    ConcreteLogin concreteLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer2);

        textView1 = (TextView) findViewById(R.id.textView2);
        textView2 = (TextView) findViewById(R.id.textView3);

        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        concreteLogin = ConcreteLogin.getInstance();

        concreteLogin.register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        concreteLogin.unregister(this);
    }

    private void doLogin() {
        UserBean loginBean = new UserBean("123", "123");

        concreteLogin.loginNotify(loginBean);
    }


    private void doExit() {
        concreteLogin.exitNotify();
    }

    @Override
    public void login(UserBean loginBean) {
        textView1.setText("ObserverActivity2:" + loginBean.getPassword());
        textView2.setText("ObserverActivity2:" + loginBean.getUserName());
    }

    @Override
    public void exit() {
        textView1.setText("");
        textView2.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                doLogin();
                break;
            case R.id.button3:
                doExit();
                break;
        }
    }
}
