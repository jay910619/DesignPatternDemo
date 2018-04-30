package com.example.jc.myapplication.iterator;

import java.util.ArrayList;

/**
 * @author jc
 * @time 2018/4/30 下午7:52
 * @desc
 */

public class Test {

    public static void main(String[] args) {
        int MAX = 10;
        ArrayList<String> arrayList = new ArrayList(MAX);
        for (int i = 0; i < MAX; i++) {
            arrayList.add("第" + i + 1 + "个元素");
        }


//        test1(arrayList);

        test2(arrayList);

        showLog(arrayList);
    }


    private static void test1(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (i / 2 == 0) {
                arrayList.remove(s);
            }
        }
    }

    private static void showLog(ArrayList<String> arrayList) {
        System.out.println(arrayList.toString());
    }

    private static void test2(ArrayList<String> arrayList) {
        for (String str : arrayList) {
            if (Math.random() * 2 < 1) {
                arrayList.remove(str);
            }

        }
    }
}
