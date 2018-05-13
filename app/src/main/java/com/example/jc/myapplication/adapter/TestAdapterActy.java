package com.example.jc.myapplication.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jc.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class TestAdapterActy extends AppCompatActivity {

    private CircleMenuLayout mLayout;

    private List<MenuItem> mMenuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testadapter_acty);

        mockMenuItems();

        mLayout = findViewById(R.id.lv);
        CircleMenuAdapter adapter = new CircleMenuAdapter(mMenuItems);

        mLayout.setOnItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(TestAdapterActy.this, mMenuItems.get(position).title, Toast.LENGTH_SHORT).show();
            }
        });

        mLayout.setAdapter(adapter);
    }

    private List<MenuItem> mockMenuItems() {

        MenuItem item0 = new MenuItem(R.mipmap.ic_launcher_round, "动漫");
        MenuItem item1 = new MenuItem(R.mipmap.ic_launcher, "电视剧");
        MenuItem item2 = new MenuItem(R.mipmap.ic_launcher_round, "电影");
        MenuItem item3 = new MenuItem(R.mipmap.ic_launcher, "音乐");
        MenuItem item4 = new MenuItem(R.mipmap.ic_launcher_round, "综艺");

        mMenuItems.add(item0);
        mMenuItems.add(item1);
        mMenuItems.add(item2);
        mMenuItems.add(item3);
        mMenuItems.add(item4);

        return mMenuItems;
    }
}
