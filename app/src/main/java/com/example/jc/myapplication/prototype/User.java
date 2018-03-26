package com.example.jc.myapplication.prototype;

/**
 * @author jc
 * @time 2018/3/26 下午9:31
 * @desc
 */

public class User implements Cloneable{
  private int id;
  private String name;
  private String phone;
  private Address address;
  private ExtraInfo extraInfo;
  private UserToken mUserToken;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ExtraInfo getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(ExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }

  public UserToken getUserToken() {
    return mUserToken;
  }

  public void setUserToken(UserToken userToken) {
    mUserToken = userToken;
  }

  @Override protected User clone()  {
    User user=null;
    try {
      user= (User) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return user;
  }

  @Override public String toString() {
    return "User{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", address="
        + address
        + ", extraInfo="
        + extraInfo
        + ", mUserToken="
        + mUserToken
        + '}';
  }
}
