package com.example.jc.myapplication.state.simple;

import android.content.Context;

/**
 * @author jc
 * @time 2018/3/30 下午3:32
 * @desc
 */

public interface UserState {

    void forward(Context context);

    void comment(Context context);
}
