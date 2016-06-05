package com.l000phone.wen.liwushuo.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;


import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.adapter.MyAdapter;

import java.util.ArrayList;

public class GuideActivity extends AppCompatActivity {

    private ViewPager vpNavi;
    private ArrayList<Object> vpList;
    private LayoutInflater mLayoutInflater;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        mLayoutInflater = LayoutInflater.from(this);
        //初始化视图
        initView();
        //初始化数据源
        initDate();
        //初始化适配器
        initAdapter();
        //绑定适配器
        bindingAdapter();
    }

    private void bindingAdapter() {
        vpNavi.setAdapter(myAdapter);
    }

    private void initAdapter() {
        myAdapter = new MyAdapter(this,vpList);
    }

    private void initDate() {
        vpList = new ArrayList<>();
        vpList.add(mLayoutInflater.inflate(R.layout.viewpager1_navigate,null));
        vpList.add(mLayoutInflater.inflate(R.layout.viewpager2_navigate,null));
        vpList.add(mLayoutInflater.inflate(R.layout.viewpager3_navigate,null));
        vpList.add(mLayoutInflater.inflate(R.layout.viewpager4_navigate,null));

    }

    private void initView() {
        vpNavi = (ViewPager)findViewById(R.id.vp_nati);
    }
    public void onClick(View view){
        Intent intent = new Intent(GuideActivity.this,SexActivity.class);
        startActivity(intent);
        finish();
    }
}
