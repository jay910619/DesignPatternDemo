package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/5/5 下午12:54
 * @desc 抽象迭代器类
 */

public interface TVIterator {

    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    boolean isFirst();

    Object currentChannel();

}
