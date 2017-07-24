package com.example.jc.myapplication.Adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jc.myapplication.R;
import com.orhanobut.logger.Logger;

import java.util.Arrays;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        int[] array = {32, 11, 2, 4, 9, 3, 5, 63, 24, 53, 2543, 534, 7878, 235};

        OperationAdapter adapter = new OperationAdapter();
        adapter.sort(array);

        Logger.i(Arrays.toString(array));

        int i = adapter.search(array, 4);

        Logger.i("" + i);
    }
}
