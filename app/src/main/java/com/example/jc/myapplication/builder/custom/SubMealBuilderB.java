package com.example.jc.myapplication.builder.custom;

/**
 * Created by jc on 2017/7/10.
 */

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯果汁");
    }
}
