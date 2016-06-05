package com.wei.design;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class CollapsingActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        initView();
        initData();

    }

//    private void initView() {
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//        tabLayout.addTab(tabLayout.newTab().setText("测试"));
//    }


    private void initData() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        List<Integer> datas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            datas.add(i);
        }
        mRecyclerView.setAdapter(new MyRecyclerViewAdapter(this, datas));
    }
}
