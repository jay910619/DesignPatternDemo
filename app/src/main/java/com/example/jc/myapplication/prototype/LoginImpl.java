package com.example.jc.myapplication.prototype;

/**
 * @author jc
 * @time 2018/3/26 下午9:46
 * @desc
 */

public class LoginImpl implements Login {
    @Override
    public void login(User user) {
        LoginSession.getInstance().setLoginUser(user);
    }
}
