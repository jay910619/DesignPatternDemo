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
    //user.setExtraInfo(new ExtraInfo(1, "今朝有酒今朝醉，莫管门前是与非", new ArrayList<String>() {{
    //  add("猴子");
    //  add("齐天大圣");
    //}}));

    Login login = new LoginImpl();
    login.login(user);

    User loginUser = LoginSession.getInstance().getLoginUser();
    System.out.println("取到的登录用户：" + loginUser.toString());

    loginUser.setName("Statue Of Liberty");
    loginUser.setPhone("100011");
    loginUser.setAddress(new Address("America", "New York", "Manhattan", "Wall Street"));
    //loginUser.setExtraInfo(new ExtraInfo(2, "Give me your tired your poor,\n"
    //    + "Your huddled masses yearning to breathe free,\n"
    //    + "The wretched refuse of your teeming shore.\n"
    //    + "Send these, the homeless, tempest-tossed to me,\n"
    //    + "I lift my lamp beside the golden door", new ArrayList<String>() {{
    //  add("freedom");
    //}}));
    System.out.println("修改后的登录用户副本:" + loginUser.toString());
    User loginUserChanged = loginUser;

    loginUser = LoginSession.getInstance().getLoginUser();
    System.out.println("修改副本后取到的登录用户：" + loginUser.toString());

    login.login(loginUserChanged);
    loginUser = LoginSession.getInstance().getLoginUser();
    System.out.println("取到的登录用户:" + loginUser.toString());
  }
}
