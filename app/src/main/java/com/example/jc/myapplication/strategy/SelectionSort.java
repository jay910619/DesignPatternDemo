package com.example.jc.myapplication.strategy;

/**
 * @author jc
 * @time 2018/3/29 上午10:39
 * @desc 选择排序
 */

public class SelectionSort implements Sort {
  @Override public int[] sort(int[] arr) {
    nonRecursionSelectionSort(arr);
    return arr;
  }

  @Override public int[] sortRecursion(int[] arr) {
    recursionSelectionSort(arr, 0, arr.length - 1);
    return arr;
  }

  private void nonRecursionSelectionSort(int[] arr) {
    System.out.println("选择排序  非递归实现");

    int len = arr.length;
    int temp;
    for (int i = 0; i < len; i++) {
      temp = arr[i];
      int j;
      int smallestLocation = i;
      for (j = i + 1; j < len; j++) {
        if (arr[j] < temp) {
          temp = arr[j];
          smallestLocation = j;
        }
      }
      arr[smallestLocation] = arr[i];
      arr[i] = temp;
    }
  }

  void recursionSelectionSort(int[] data, int start, int end) {
    System.out.println("选择排序  递归实现");
    if (start < end) {

      int temp = data[start];
      int index = start;
      for (int i = start + 1; i < end + 1; i++) {
        if (data[index] > data[i]) {
          index = i;
        }
      }

      if (start != index) {
        temp = data[start];
        data[start] = data[index];
        data[index] = temp;
      }

      start++;
      recursionSelectionSort(data, start, end);
    }
  }
}
