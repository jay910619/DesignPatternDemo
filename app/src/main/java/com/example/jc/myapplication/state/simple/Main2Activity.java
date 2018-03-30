package com.example.jc.myapplication.state.simple;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.jc.myapplication.R;

public class Main2Activity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    findViewById(R.id.forward_btn).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LoginContext.getLoginContext().forward(Main2Activity.this);
      }
    });

    findViewById(R.id.commit_btn).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LoginContext.getLoginContext().comment(Main2Activity.this);
      }
    });
    findViewById(R.id.logout_btn).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LoginContext.getLoginContext().setState(new LogoutState());
      }
    });
  }
}
