package com.example.jc.myapplication.adapter;

/**
 * Created by jc on 2017/7/23.
 */

public class OperationAdapter extends AbstractDataOperation {
    QuickSort quickSort;
    BinarySearch binarySearch;


    OperationAdapter() {
        this(new QuickSort(), new BinarySearch());
    }

    OperationAdapter(QuickSort quickSort, BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    @Override
    public void sort(int[] array) {
        quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int i) {


        return binarySearch.binarySearch(array, i);
    }
}
