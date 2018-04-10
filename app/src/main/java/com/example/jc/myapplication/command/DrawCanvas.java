package com.example.jc.myapplication.command;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * @author jc
 * @time 2018/4/9 下午11:17
 * @desc 自定义view ，承担画板功能
 */

public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {

    public boolean isDrawing, isRunning;

    private Bitmap mBitmap;
    private DrawInvoker mInvoker;
    private DrawThread mDrawThread;

    public DrawCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);

        mInvoker = new DrawInvoker();
        mDrawThread = new DrawThread();

        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        mDrawThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        isRunning = false;
        while (retry) {
            try {
                mDrawThread.join();
                retry = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 增加绘制路径
     */
    public void add(DrawPath path) {
        mInvoker.add(path);
    }

    public void redo() {
        isDrawing = true;
        mInvoker.redo();
    }

    public void undo() {
        isDrawing = true;
        mInvoker.undo();
    }

    public boolean canRedo() {
        return mInvoker.canRedo();
    }

    public boolean canUndo() {
        return mInvoker.canUndo();
    }

    private class DrawThread extends Thread {
        @Override
        public void run() {
            Canvas canvas = null;
            while (isRunning) {
                if (isDrawing) {
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if (mBitmap == null) {
                            mBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }
                        Canvas c = new Canvas(mBitmap);
                        c.drawColor(0, PorterDuff.Mode.CLEAR);

                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        mInvoker.execute(c);
                        canvas.drawBitmap(mBitmap, 0, 0, null);
                    } finally {
                        getHolder().unlockCanvasAndPost(canvas);
                    }
                    isDrawing = false;
                }
            }
        }
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }
}
