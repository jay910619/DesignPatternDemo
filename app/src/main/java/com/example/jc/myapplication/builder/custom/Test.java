package com.example.jc.myapplication.builder.custom;

/**
 * @author jc
 * @time 2018/3/26 上午9:55
 * @desc
 */

public class Test {

  public static void main(String[] args) {

    Waiter waiter = new Waiter();
    waiter.setMealBuilder(new SubMealBuilderA());
    Meal meal = waiter.construct();

    log(meal);

    waiter.setMealBuilder(new SubMealBuilderB());
    meal = waiter.construct();

    log(meal);
  }

  private static void log(Meal meal) {
    System.out.println(meal.getClass() + ":" + meal.getFood() + ":" + meal.getDrink());
  }
}
