package com.example.jc.myapplication.builder.custom;

/**
 * Created by jc on 2017/7/10.
 */

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
