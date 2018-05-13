package com.example.jc.myapplication.composite;

import java.util.Iterator;
import java.util.List;

/**
 * @author jc
 * @time 2018/5/13 上午11:04
 * @desc
 */

public class Folder extends Dir {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + " (");

        Iterator<Dir> iterator = dirs.iterator();
        while (iterator.hasNext()) {
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(") ");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
