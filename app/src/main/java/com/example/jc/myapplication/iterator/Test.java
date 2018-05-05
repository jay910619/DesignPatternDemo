package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/4/30 下午7:52
 * @desc
 */

public class Test {

    public static void main(String[] args) {

        Television tv = new SkyworthTelevision();

        TVIterator iterator = tv.createIterator();
        display(iterator);
        iterator.setChannel(5);
        reverseDisplay(iterator);


        System.out.println("\n-------------------\n");

        Television tv2 = new TclTelevision();
        TVIterator iterator2 = tv2.createIterator();
        display(iterator2);
        iterator2.setChannel(5);
        reverseDisplay(iterator2);

        
    }


    private static void display(TVIterator iterator) {
        System.out.println("电视机频道");
        while (!iterator.isLast()) {
            System.out.println(iterator.currentChannel().toString());
            iterator.next();
        }
    }


    private static void reverseDisplay(TVIterator iterator) {

        System.out.println("逆向遍历电视机频道");
        while (!iterator.isFirst()) {
            System.out.println(iterator.currentChannel().toString());
            iterator.previous();
        }
    }

}
