package com.example.jc.myapplication.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jc
 * @time 2018/5/13 上午10:57
 * @desc
 */

public abstract class Dir {

    /**
     * 声明一个 list 成员变量存储文件夹下的所有元素
     */
    protected List<Dir> dirs = new ArrayList<>();

    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或文件夹
     *
     * @param dir 文件或文件夹
     */
    public abstract void addDir(Dir dir);

    /**
     * 删除一个文件或文件夹
     *
     * @param dir 文件或文件夹
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清空文件夹下所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有文件或子文件夹
     *
     * @return 文件夹下所有文件或子文件夹
     */
    public abstract List<Dir> getFiles();


    /**
     * 获取文件或文件夹名
     *
     * @return 文件或文件夹名
     */
    public String getName() {
        return name;
    }
}
