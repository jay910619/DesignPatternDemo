package com.example.jc.myapplication.Builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jc.myapplication.Builder.Meal;
import com.example.jc.myapplication.Builder.MealBuilder;
import com.example.jc.myapplication.Builder.SubMealBuilderA;
import com.example.jc.myapplication.Builder.Waiter;
import com.example.jc.myapplication.R;
import com.example.jc.myapplication.Utils.Mtoast;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        MealBuilder mealBuilder = new SubMealBuilderA();

        Waiter waiter = new Waiter();
        waiter.setMealBuilder(mealBuilder);

        Meal meal = waiter.construct();

        Mtoast.getInstance(this).shortToast(meal.getFood() + ":" + meal.getDrink());

    }
}
