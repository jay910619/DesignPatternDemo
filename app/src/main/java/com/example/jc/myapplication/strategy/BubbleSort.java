package com.example.jc.myapplication.strategy;

/**
 * @author jc
 * @time 2018/3/29 上午10:39
 * @desc 冒泡排序
 */

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        nonRecursionBubbleSort(arr);
        return arr;
    }

    @Override
    public int[] sortRecursion(int[] arr) {
        recursionBubbleSort(arr, 0, arr.length - 1);
        return arr;
    }

    /**
     * 非递归实现
     */
    private void nonRecursionBubbleSort(int[] arr) {
        System.out.println("冒泡排序  非递归实现");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * 递归实现
     */
    void recursionBubbleSort(int[] data, int start, int end) {
        System.out.println("冒泡排序  递归实现");
        if (start < end) {
            int temp = 0;
            int length = end - start + 1;
            for (int i = start; i < length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
            end--;
            recursionBubbleSort(data, start, end);
        }
    }
}
