package com.example.jc.myapplication.composite;

/**
 * @author jc
 * @time 2018/5/13 上午11:09
 * @desc
 */

public class Client {

    public static void main(String[] args) {

        Dir disk = new Folder("木叶");
        File file = new File("火影");
        disk.addDir(file);

        Dir high = new Folder("上忍");
        disk.addDir(high);

        Dir low = new Folder("下忍");
        disk.addDir(low);

        Dir elite = new Folder("精英上忍");
        high.addDir(elite);
        elite.addDir(new File("卡卡西 "));

        Dir general = new Folder("普通上忍");
        high.addDir(general);
        general.addDir(new File("宁次"));

        low.addDir(new File("鸣人"));
        low.addDir(new File("佐助"));


        disk.print();


        System.out.println("\n---------------------\n");

        disk.rmDir(file);

        disk.print();

    }
}
