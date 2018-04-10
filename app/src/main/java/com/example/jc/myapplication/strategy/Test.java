package com.example.jc.myapplication.strategy;

/**
 * @author jc
 * @time 2018/3/29 上午10:35
 * @desc 策略模式测试类
 */

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 77, 34, 5, 8, 32, 55, 6, 78, 9};

        int[] result;

        ArrayHandler ah = new ArrayHandler();

        ah.setSort(new BubbleSort());

        //ah.setSort(new InsertionSort());

        //ah.setSort(new SelectionSort());

        //ah.setSort(new QuickSort());

        result = ah.sort(arr);

        for (Integer a : result) {
            System.out.print(a + ",");
        }
    }
}
