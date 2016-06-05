package com.l000phone.wen.liwushuo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.l000phone.wen.liwushuo.utils.AppManager;


public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getAppManager().addActivity(this);
    }

    public final void init() {
        initView();
        initData();

    }


    public void initView() {

    }

    public void initData() {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AppManager.getAppManager().finishActivity();
    }
}
