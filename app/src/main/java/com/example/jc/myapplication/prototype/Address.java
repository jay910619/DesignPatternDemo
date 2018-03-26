package com.example.jc.myapplication.prototype;

/**
 * @author jc
 * @time 2018/3/26 下午9:32
 * @desc
 */

public class Address implements Cloneable{

  private String country;
  private String province;
  private String city;
  private String street;

  public Address(String country, String province, String city, String street) {
    this.country = country;
    this.province = province;
    this.city = city;
    this.street = street;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override protected Address clone() throws CloneNotSupportedException {
    return (Address) super.clone();
  }

  @Override public String toString() {
    return "Address{"
        + "country='"
        + country
        + '\''
        + ", province='"
        + province
        + '\''
        + ", city='"
        + city
        + '\''
        + ", street='"
        + street
        + '\''
        + '}';
  }
}
