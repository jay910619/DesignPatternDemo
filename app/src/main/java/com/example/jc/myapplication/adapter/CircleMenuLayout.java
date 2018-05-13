package com.example.jc.myapplication.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Adapter;


/**
 * @author jc
 * @time 2018/5/13 下午4:16
 * @desc 简单圆形菜单，功能待拓展
 */

public class CircleMenuLayout extends ViewGroup {

    //  圆形直径
    private int mRadius;

    // 容器内 child item 的默认尺寸
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;

    //容器的内边距
    private static final float RADIO_PADDING_LAYOUT = 1 / 12f;

    private float mPadding;

    //布局时的开始角度
    private double mStartAngel = 0;


    private Adapter adapter;


    private OnMenuItemClickListener onItemClickListener;

    public CircleMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public void setOnItemClickListener(OnMenuItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        measureSelf(widthMeasureSpec, heightMeasureSpec);

        measureChildViews();
    }


    private void measureSelf(int widthMeasureSpec, int heightMeasureSpec) {
        int resWidth = 0;
        int resHeight = 0;

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);

        int height = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if (widthMode != MeasureSpec.EXACTLY || heightMode != MeasureSpec.EXACTLY) {
            //设置背景图的高度
            resWidth = getSuggestedMinimumWidth();
            resWidth = resWidth == 0 ? getDefaultWidth() : resWidth;

            //如果未设置背景图片，则设置为屏幕宽高的默认值
            resHeight = getSuggestedMinimumHeight();
            resHeight = resHeight == 0 ? getDefaultWidth() : resHeight;
        } else {
            resWidth = resHeight = Math.min(width, height);
        }

        setMeasuredDimension(resWidth, resHeight);
    }

    private void measureChildViews() {

        //获得半径
        mRadius = Math.max(getMeasuredWidth(), getMeasuredHeight());

        final int count = getChildCount();

        int childSize = (int) (mRadius * RADIO_DEFAULT_CHILD_DIMENSION);

        int childMode = MeasureSpec.EXACTLY;


        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() == GONE) {
                continue;
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(childSize, childMode);
            child.measure(makeMeasureSpec, makeMeasureSpec);
        }

        mPadding = RADIO_PADDING_LAYOUT * mRadius;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        final int childCount = getChildCount();
        int left, top;
        int itemWidth = (int) (mRadius * RADIO_DEFAULT_CHILD_DIMENSION);

        //计算 item 的布局占用角度
        float angelDelay = 360 / childCount;

        for (int i = 0; i < adapter.getCount(); i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() == GONE) {
                continue;
            }
            mStartAngel %= 360;
            //计算中心点到 menu item 的距离
            float distancefromCenter = mRadius / 2f - itemWidth / 2 - mPadding;
            //menu item 中心点的 left 坐标
            left = (int) (mRadius / 2 + Math.round(distancefromCenter * Math.cos(Math.toRadians(mStartAngel)) - 1 / 2f * itemWidth));
            // menu item 的中心点的 纵坐标
            top = (int) (mRadius / 2 + Math.round(distancefromCenter * Math.sin(Math.toRadians(mStartAngel)) - 1 / 2f * itemWidth));
            //layout child item
            child.layout(left, top, left + itemWidth, top + itemWidth);
            // 叠加尺寸, 调整初始角度
            mStartAngel += angelDelay;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        if (adapter != null) {
            buildMenuItems();
        }
        super.onAttachedToWindow();
    }

    private void buildMenuItems() {
        for (int i = 0; i < adapter.getCount(); i++) {
            final View viewItem = adapter.getView(i, null, this);
            final int position = i;
            viewItem.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(viewItem, position);
                    }
                }
            });

            addView(viewItem);
        }
    }

    /**
     * 获得该 layout 的尺寸
     *
     * @return
     */
    public int getDefaultWidth() {
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return Math.min(outMetrics.widthPixels, outMetrics.heightPixels);
    }

    public interface OnMenuItemClickListener {
        void onItemClick(View view, int position);
    }
}
