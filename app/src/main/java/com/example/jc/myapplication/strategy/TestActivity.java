package com.example.jc.myapplication.strategy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.example.jc.myapplication.R;
import java.util.ArrayList;

public class TestActivity extends AppCompatActivity
    implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

  TextView textView;

  private ArrayHandler ah;

  ArrayList<String> mArray = new ArrayList<>();

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test);

    ah = new ArrayHandler();

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        int[] arr = { 1, 3, 6, 2, 77, 34, 5, 8, 32, 55, 6, 7, 9 };

        StringBuffer stringBuffer = new StringBuffer();

        for (Integer a : arr) {
          stringBuffer.append(a).append(",");
        }
        mArray.add("排序前的数据：" + "\n" + stringBuffer.toString() + "\n");
        mArray.add("排序方案：" + ah.getStateType() + "\n");

        stringBuffer.setLength(0);
        for (Integer a : ah.sort(arr)) {
          stringBuffer.append(a).append(",");
        }
        mArray.add("排序后的数据：" + "\n" + stringBuffer.toString() + "\n");
        mArray.add("排序用时 ：" + ah.getUsedTime() + "\n");
        textView.setText(mArray.toString());
      }
    });

    findViewById(R.id.bubble).setOnClickListener(this);
    findViewById(R.id.insert).setOnClickListener(this);
    findViewById(R.id.quick).setOnClickListener(this);
    findViewById(R.id.select).setOnClickListener(this);
    ToggleButton toggleButton = findViewById(R.id.toggleButton);
    toggleButton.setOnCheckedChangeListener(this);
    toggleButton.setTextOff("开启递归");
    toggleButton.setChecked(false);
    toggleButton.setTextOn("关闭递归");

    textView = findViewById(R.id.textView4);
  }

  @Override public void onClick(View v) {

    switch (v.getId()) {
      case R.id.bubble:
        ah.setSort(new BubbleSort());
        mArray.add("排序策略 ：冒泡排序" + "\n");
        break;
      case R.id.insert:
        ah.setSort(new InsertionSort());
        mArray.add("排序策略 ：插入排序" + "\n");
        break;
      case R.id.quick:
        ah.setSort(new QuickSort());
        mArray.add("排序策略 ：快速排序" + "\n");
        break;
      case R.id.select:
        ah.setSort(new SelectionSort());
        mArray.add("排序策略 ：选择排序" + "\n");
        break;
      default:
        break;
    }
  }

  @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    ah.useRecursion(isChecked ? ArrayHandler.RECURSION : ArrayHandler.NORMAL);
  }
}
