package com.example.jc.myapplication.prototype;

import java.util.ArrayList;

/**
 * @author jc
 * @time 2018/3/26 下午10:03
 * @desc
 */

public class Test {

  public static void main(String[] args) {
    User user = new User();
    user.setId(1);
    user.setName("悟空");
    user.setPhone("100000");
    user.setAddress(new Address("傲来国", "东胜神州", "花果山", "水帘洞"));
    user.setLabel(new ArrayList<String>() {{
      add("猴子");
      add("齐天大圣");
    }});

    Login login = new LoginImpl();
    login.login(user);

    System.out.println("---------登录用户----------");
    user.show();

    User newUser = LoginSession.getInstance().getLoginUser();
    System.out.println("---------取到的登录用户副本----------");
    newUser.show();

    System.out.println("---------内存地址判断start----------");
    System.out.println("Name ：" + (user.getName() == newUser.getName()));
    System.out.println("Address ：" + (user.getAddress() == newUser.getAddress()));
    System.out.println("---------内存地址判断end-------------");

    newUser.setName("Statue Of Liberty");
    newUser.setPhone("100011");

    newUser.getAddress().setCountry("America");
    newUser.getAddress().setProvince("New York");
    newUser.getAddress().setCity("Manhattan");
    newUser.getAddress().setStreet("Wall Street");

    newUser.addLabel("freedom");

    System.out.println("---------修改后的登录用户副本----------");
    newUser.show();

    System.out.println("---------修改副本后取到的登录用户----------");
    LoginSession.getInstance().getLoginUser().show();

    login.login(newUser);
    System.out.println("---------变更登录后取到的登录用户----------");
    LoginSession.getInstance().getLoginUser().show();
  }
}
