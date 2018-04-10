package com.example.jc.myapplication.adapter;

import com.orhanobut.logger.Logger;

import java.util.Arrays;

/**
 * @author jc
 * @time 2018/3/26 上午10:02
 * @desc 适配器模式测试
 */

public class Test {
    public static void main(String[] args) {

        int[] array = {32, 11, 2, 4, 9, 3, 5, 63, 24, 53, 2543, 534, 7878, 235};

        OperationAdapter adapter = new OperationAdapter();
        adapter.sort(array);

        System.out.print(Arrays.toString(array));

        int i = adapter.search(array, 4);

        System.out.print("search " + i);
    }
}
