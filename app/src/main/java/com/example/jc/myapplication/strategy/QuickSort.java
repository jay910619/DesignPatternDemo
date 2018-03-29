package com.example.jc.myapplication.strategy;

import java.util.Stack;

/**
 * @author jc
 * @time 2018/3/29 上午10:41
 * @desc 快速排序
 */

public class QuickSort implements Sort {
  @Override public int[] sort(int[] arr) {
    nonRecrutQuickSort(arr);
    return arr;
  }

  @Override public int[] sortRecursion(int[] arr) {
    recursionQuickSort(arr, 0, arr.length - 1);
    return arr;
  }

  private void nonRecrutQuickSort(int a[]) {
    System.out.println("快速排序  非递归实现");
    if (a == null || a.length <= 0) {
      return;
    }
    Stack<Integer> index = new Stack<Integer>();
    int start = 0;
    int end = a.length - 1;

    int pivotPos;

    index.push(start);
    index.push(end);

    while (!index.isEmpty()) {
      end = index.pop();
      start = index.pop();

      pivotPos = partition(a, start, end);
      if (start < pivotPos - 1) {
        index.push(start);
        index.push(pivotPos - 1);
      }
      if (end > pivotPos + 1) {
        index.push(pivotPos + 1);
        index.push(end);
      }
    }
  }

  /**
   * 快速排序 递归实现
   */
  private void recursionQuickSort(int[] a, int low, int high) {
    System.out.println("快速排序  递归实现");
    if (low < high) {
      //获取一次交换结束后 分界点的位置
      int pivot = partition(a, low, high);
      //对分界点左边排序
      recursionQuickSort(a, low, pivot - 1);
      //对分界点右边排序
      recursionQuickSort(a, pivot + 1, high);
    }
  }

  private int partition(int[] a, int low, int high) {
    int pivot = a[low];
    while (low < high) {
      /**
       *  右边找到第一个比自己小的数
       */
      while (low < high && a[high] >= pivot) {
        --high;
      }
      //将比枢轴值小的元素移到左边
      a[low] = a[high];

      /**
       *左边找到第一个比自己小的数
       */
      while (low < high && a[low] <= pivot) {
        ++low;
      }
      //将比枢轴值大的元素移到右边
      a[high] = a[low];
    }
    //将枢轴值元素置于最终位置
    a[low] = pivot;
    return low;
  }
}
