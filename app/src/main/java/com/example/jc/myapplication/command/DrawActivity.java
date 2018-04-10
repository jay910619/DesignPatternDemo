package com.example.jc.myapplication.command;

import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.jc.myapplication.R;

/**
 * @author jc
 * @time 2018/4/10 上午10:21
 * @desc 测试Activity
 */
public class DrawActivity extends AppCompatActivity implements View.OnClickListener {

    private DrawPath mPath;
    private DrawCanvas mCanvas;
    private Paint mPaint;
    private IBrush mBrush;

    private Button btnRedo, btnUndo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        mPaint = new Paint();
        mPaint.setColor(0xFFFFFFFF);
        mPaint.setStrokeWidth(3);

        mBrush = new NormalBrush();

        mCanvas = findViewById(R.id.draw_canvas);
        mCanvas.setOnTouchListener(new DrawTouchListener());

        btnRedo = findViewById(R.id.redo);
        btnUndo = findViewById(R.id.undo);
        btnRedo.setEnabled(false);
        btnUndo.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red:
                mPaint = new Paint();
                mPaint.setColor(0xFFFF0000);
                mPaint.setStrokeWidth(3);
                break;
            case R.id.green:
                mPaint = new Paint();
                mPaint.setColor(0xFF00FF00);
                mPaint.setStrokeWidth(3);
                break;
            case R.id.blue:
                mPaint = new Paint();
                mPaint.setColor(0xFF0000FF);
                mPaint.setStrokeWidth(3);
                break;
            case R.id.normal:
                mBrush = new NormalBrush();
                break;
            case R.id.circle:
                mBrush = new CircleBrush();
                break;
            case R.id.redo:
                mCanvas.redo();
                if (!mCanvas.canRedo()) {
                    btnRedo.setEnabled(false);
                }
                btnUndo.setEnabled(true);
                break;
            case R.id.undo:
                mCanvas.undo();
                if (!mCanvas.canUndo()) {
                    btnUndo.setEnabled(false);
                }
                btnRedo.setEnabled(true);
                break;
            default:
                break;
        }
    }

    private class DrawTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    mPath = new DrawPath();
                    mPath.paint = mPaint;
                    mPath.path = new Path();
                    mBrush.down(mPath.path, event.getX(), event.getY());
                    break;
                case MotionEvent.ACTION_UP:
                    mBrush.up(mPath.path, event.getX(), event.getY());
                    mCanvas.add(mPath);
                    mCanvas.isDrawing = true;
                    btnUndo.setEnabled(true);
                    btnRedo.setEnabled(false);
                    break;
                case MotionEvent.ACTION_MOVE:
                    mBrush.move(mPath.path, event.getX(), event.getY());
                    break;
                default:
                    break;
            }
            return true;
        }
    }
}
