package com.example.jc.myapplication.state.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.example.jc.myapplication.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    findViewById(R.id.login_btn).setOnClickListener(new OnClickListener() {
      @Override public void onClick(View v) {
        login();
        finish();
      }

      private void login() {

        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        LoginContext.getLoginContext().setState(new LoginState());
        Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
      }
    });
  }
}

