package com.example.jc.myapplication.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jc
 * @time 2018/3/26 下午9:31
 * @desc
 */

public class User implements Cloneable {
    private int id;
    private String name;
    private String phone;
    private Address address;
    /**
     * 用户标签
     */
    private ArrayList<String> label;

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(ArrayList<String> label) {
        this.label = label;
    }

    public void addLabel(String lb) {
        label.add(lb);
    }

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

    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            user.address = this.address.clone();
            user.label = (ArrayList<String>) this.label.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void show() {
        System.out.println("----- User start-------");
        System.out.println("name : " + getName());
        System.out.println("phone : " + getPhone());
        System.out.println("country: " + getAddress().getCountry());
        System.out.println("city: " + getAddress().getCity());
        System.out.println("province: " + getAddress().getProvince());
        System.out.println("street: " + getAddress().getStreet());

        for (String s : getLabel()) {
            System.out.println("label : " + s);
        }
        System.out.println("----- User end-------");
    }
}
