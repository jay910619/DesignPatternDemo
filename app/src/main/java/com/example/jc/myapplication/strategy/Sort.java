package com.example.jc.myapplication.strategy;

/**
 * @author jc
 * @time 2018/3/29 上午10:38
 * @desc
 */

public interface Sort {

    /**
     * 普通实现
     *
     * @param arr 需排序的数组
     * @return 排序完成后的数组arr
     */
    int[] sort(int[] arr);

    /**
     * 通过递归实现
     *
     * @param arr 需排序的数组
     * @return 排序完成后的数组arr
     */
    int[] sortRecursion(int[] arr);
}
