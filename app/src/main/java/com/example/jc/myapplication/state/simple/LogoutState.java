package com.example.jc.myapplication.state.simple;

import android.content.Context;
import android.content.Intent;

/**
 * @author jc
 * @time 2018/3/30 下午3:37
 * @desc
 */

public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        goLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        goLoginActivity(context);
    }

    private void goLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
