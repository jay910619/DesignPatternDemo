package com.example.jc.myapplication.strategy;

/**
 * @author jc
 * @time 2018/3/29 上午10:40
 * @desc 插入排序
 */

public class InsertionSort implements Sort {
  @Override public int[] sort(int[] arr) {
    nonRecursionInsertionSort(arr);
    return arr;
  }

  @Override public int[] sortRecursion(int[] arr) {
    recursionInsertionSort(arr, arr.length-1);
    return arr;
  }

  private void nonRecursionInsertionSort(int[] arr) {
    System.out.println("插入排序  非递归实现");
    int len = arr.length;
    for (int i = 1; i < len; i++) {
      int temp = arr[i];
      int j;
      for (j = i; j > 0; j--) {
        if (arr[j - 1] > temp) {
          arr[j] = arr[j - 1];
        } else {
          break;
        }
      }
      arr[j] = temp;
    }
  }

  /**
   * 递归插入，跟求阶乘的思想一样，前n-1个排好序的数组，是建立在前n-2个排好序的数组的基础上插出来的
   */
  private void recursionInsertionSort(int[] a, int n) {
    System.out.println("插入排序  递归实现");
    if (n > 0) {
      recursionInsertionSort(a, n - 1);
      Insert(a, n);
    } else {
      return;
    }
  }

  /**
   * 把数组a的第n个数插入前n-1个数中，注意前n-1个数已经是排好序的了
   */
  private void Insert(int[] a, int n) {
    int i = n - 1;
    int key = a[n];
    while ((i >= 0) && (key < a[i])) {
      a[i + 1] = a[i];
      i--;
    }
    a[i + 1] = key;
    return;
  }
}
