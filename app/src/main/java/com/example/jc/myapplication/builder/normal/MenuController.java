package com.example.jc.myapplication.builder.normal;

/**
 * @author jc
 * @time 2018/3/26 上午10:18
 * @desc
 */

public class MenuController {

    private String food;
    private String drink;
    /**
     * 点单份量
     */
    private int count;
    /**
     * 类型  外带，食堂
     */
    private int type;
    /**
     * 备注
     */
    private String remark;

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static class MenuParams {

        public String food;
        public String drink;
        public int count;
        public int type;
        public String remark;

        public void apply(MenuController waiter) {
            if (drink != null) {
                waiter.setDrink(drink);
            }
            if (food != null) {
                waiter.setFood(food);
            }
            if (count > 1) {
                waiter.setCount(count);
            } else {
                waiter.setCount(1);
            }
            if (type > 0) {
                waiter.setType(type);
            } else {
                waiter.setType(0);
            }

            if (remark != null) {
                waiter.setRemark(remark);
            }
        }
    }

    @Override
    public String toString() {
        return "MenuController{" + (food != null ? "food='" + food + '\'' : "")

                + (drink != null ? ", drink='" + drink + '\'' : "")

                + (count > 0 ? ", count='" + count + '\'' : "")

                + (type > 0 ? ", type='" + type + '\'' : "")

                + (remark != null ? ", remark='" + remark + '\'' : "")

                + '}';
    }
}
