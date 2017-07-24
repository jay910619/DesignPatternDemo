package com.example.jc.myapplication.Adapter;

import java.util.Arrays;

/**
 * Created by jc on 2017/7/23.
 */

public class BinarySearch {
    //使用前提 array为有序数组
    public int binarySearch(int[] array, int i) {

        return binarySearch(array, i, 0, array.length - 1);

//        return Arrays.binarySearch(array, i);
    }


    private int binarySearch(int[] array, int target, int start, int end) {


        int middle = (start + end) / 2;

        if (middle == start || middle == end) {
            return array[middle] == target ? middle : -1;
        }

        if (array[middle] == target) {
            return middle;
        } else if (target < array[middle]) {
            return binarySearch(array, target, 0, middle - 1);
        } else {
            return binarySearch(array, target, middle + 1, end);
        }


    }
}
