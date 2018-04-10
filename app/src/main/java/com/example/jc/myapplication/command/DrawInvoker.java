package com.example.jc.myapplication.command;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jc
 * @time 2018/4/9 下午11:07
 * @desc 对绘制命令的进一步封装，实现撤销和重做方法
 */

public class DrawInvoker {

    /**
     * 绘制列表
     */
    private List<DrawPath> drawList = Collections.synchronizedList(new ArrayList<DrawPath>());

    /**
     * 重做列表
     */
    private List<DrawPath> redoList = Collections.synchronizedList(new ArrayList<DrawPath>());

    /**
     * 增加一个命令  设值注入形式
     *
     * @parm command  具体命令类对象
     */
    public void add(DrawPath command) {
        redoList.clear();
        drawList.add(command);
    }

    /**
     * 撤销上一步的操作
     */
    public void undo() {
        if (drawList.size() > 0) {
            DrawPath undo = drawList.get(drawList.size() - 1);
            drawList.remove(drawList.size() - 1);
            undo.undo();
            redoList.add(undo);
        }
    }

    /**
     * 恢复撤销的操作
     */
    public void redo() {
        if (redoList.size() > 0) {
            DrawPath redoCommand = redoList.get(redoList.size() - 1);
            redoList.remove(redoList.size() - 1);
            drawList.add(redoCommand);
        }
    }

    /**
     * 执行命令
     * 业务方法  调用命令类的draw（）方法
     */
    public void execute(Canvas canvas) {
        if (drawList != null) {
            for (DrawPath tmp : drawList) {
                tmp.draw(canvas);
            }
        }
    }

    /**
     * 判断是否可以重做
     */
    public boolean canRedo() {
        return redoList.size() > 0;
    }

    /**
     * 判断是否可以撤销
     */
    public boolean canUndo() {
        return drawList.size() > 0;
    }
}
