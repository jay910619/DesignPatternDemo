package com.example.jc.myapplication.Observer;

import java.util.ArrayList;

/**
 * Created by jc on 2017/7/23.
 */

//抽象目标类，被观察者
public abstract class Login {
    protected ArrayList observers = new ArrayList();

    public abstract void register(LoginObserver observer);

    public abstract void unregister(LoginObserver observer);

    public abstract void loginNotify(UserBean loginBean);

    public abstract void exitNotify();

}
