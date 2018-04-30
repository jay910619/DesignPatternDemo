package com.example.jc.myapplication.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jc
 * @time 2018/4/30 下午5:56
 * @desc 负责管理 Memoto 对象
 */

public class NoteCaretaker {

    /**
     * 最大存储数量
     */
    private static final int MAX = 20;
    List<Memoto> mMemotos = new ArrayList<>(MAX);
    int mIndex = 0;

    /**
     * 保存备忘录记录到记录列表中
     *
     * @param memoto
     */
    public void saveMemoto(Memoto memoto) {
        if (mMemotos.size() > MAX) {
            mMemotos.remove(0);
        }
        mMemotos.add(memoto);
        mIndex = mMemotos.size() - 1;
    }

    /**
     * 获取上一个存档信息
     *
     * @return
     */
    public Memoto getPrevMemoto() {

        mIndex = mIndex > 0 ? --mIndex : mIndex;
        return mMemotos.get(mIndex);
    }

    /**
     * 获取下一个存档信息，相当于恢复
     *
     * @return
     */
    public Memoto getNextMemoto() {
        mIndex = mIndex < mMemotos.size() - 1 ? ++mIndex : mIndex;
        return mMemotos.get(mIndex);
    }

}
