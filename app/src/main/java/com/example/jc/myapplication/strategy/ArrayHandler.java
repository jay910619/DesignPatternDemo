package com.example.jc.myapplication.strategy;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author jc
 * @time 2018/3/29 上午10:42
 * @desc 环境类
 */

public class ArrayHandler {

    public static final int NORMAL = 0;
    public static final int RECURSION = 1;

    private long time;

    /**
     * 默认使用快速排序
     */
    private Sort mSort = new QuickSort();

    private @State
    int state = NORMAL;

    public void setUsedTime(long usedTime) {
        this.time = usedTime;
    }

    public long getUsedTime() {
        return time;
    }

    @IntDef({NORMAL, RECURSION})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public int[] sort(int[] arr) {
        Long startTime = System.currentTimeMillis();
        if (state == NORMAL) {
            mSort.sort(arr);
        }

        if (state == RECURSION) {
            mSort.sortRecursion(arr);
        }
        Long endTime = System.currentTimeMillis();

        setUsedTime(endTime - startTime);
        return arr;
    }

    public void setSort(Sort sort) {
        mSort = sort;
    }

    public void useRecursion(@State int state) {
        this.state = state;
    }

    public String getStateType() {
        return state == NORMAL ? "非递归" : "递归";
    }
}
