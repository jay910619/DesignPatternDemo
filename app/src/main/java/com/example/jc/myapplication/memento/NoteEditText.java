package com.example.jc.myapplication.memento;

import android.content.Context;
import android.util.AttributeSet;

/**
 * @author jc
 * @time 2018/4/30 下午6:07
 * @desc NoteEditText充当Originator角色，创建和恢复备忘录
 */

public class NoteEditText extends android.support.v7.widget.AppCompatEditText {
    public NoteEditText(Context context) {
        this(context, null);
    }


    public NoteEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NoteEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 创建备忘录对象 存储编辑的信息
     *
     * @return
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.text = getText().toString();
        memoto.cursor = getSelectionStart();
        return memoto;
    }

    /**
     * 从备忘录中恢复数据
     *
     * @param memoto
     */
    public void restore(Memoto memoto) {
        setText(memoto.text);
        setSelection(memoto.cursor);
    }

}
