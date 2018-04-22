package com.example.jc.myapplication.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jc.myapplication.R;

public class LoginControlActivity extends AppCompatActivity {
    EditText et_user_name, et_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_control);

        et_user_name = findViewById(R.id.et_user_name);
        et_pwd = findViewById(R.id.et_pwd);
    }


    public void doLogin(View view) {
        UserBean loginBean = new UserBean(getUserName(), getPwd());
        ConcreteLogin.getInstance().loginNotify(loginBean);
    }


    public void doExit(View view) {
        ConcreteLogin.getInstance().exitNotify();
    }

    private String getUserName() {
        return et_user_name.getText().toString();
    }

    private String getPwd() {
        return et_pwd.getText().toString();
    }
}
