package com.example.jc.myapplication.adapter;

import android.os.Parcel;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jc.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jc
 * @time 2018/5/13 下午4:42
 * @desc
 */

public class CircleMenuAdapter extends BaseAdapter {

    List<MenuItem> mMenuItems = new ArrayList<>();


    public CircleMenuAdapter(List<MenuItem> mMenuItems) {
        this.mMenuItems = mMenuItems;
    }

    @Override
    public int getCount() {
        return mMenuItems.size();
    }

    @Override
    public MenuItem getItem(int position) {
        if (position > mMenuItems.size()) {

        }
        return mMenuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        View itemView = mInflater.inflate(R.layout.circle_menu_item, parent, false);
        initMenuItem(itemView, position);
        return itemView;
    }

    /**
     * 初始化菜单项布局
     *
     * @param itemView 菜单view
     * @param position 菜单项所在位置
     */
    private void initMenuItem(View itemView, int position) {
        MenuItem t = getItem(position);
        TextView tv = itemView.findViewById(R.id.circle_tv);
        ImageView iv = itemView.findViewById(R.id.circle_iv);
        iv.setImageResource(t.imageId);
        tv.setText(t.title);

    }
}
