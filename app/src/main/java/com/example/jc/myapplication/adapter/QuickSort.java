package com.example.jc.myapplication.adapter;

/**
 * Created by jc on 2017/7/23.
 */

public class QuickSort {
    public void quickSort(int[] array) {

        quick_sort(array, 0, array.length - 1);

//         Arrays.sort(array);


    }

    void quick_sort(int s[], int l, int r) {
        if (l < r) {
            int i = l, j = r;
            int x = s[l];//基准数
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && s[j] >= x)
                    j--;
                if (i < j)
                    s[i++] = s[j];

                // 从左向右找第一个大于等于x的数
                while (i < j && s[i] < x)
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            //i=j 一次排序结束，将基准数插入最终位置
            s[i] = x;

            //递归分治
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
    }

}
