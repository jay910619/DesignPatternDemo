package com.example.jc.myapplication.observer;

/**
 * Created by jc on 2017/7/23.
 */

//抽象观察者类
public interface LoginObserver {

    void login(UserBean loginBean);//登录成功

    void exit();//退出登录
}
