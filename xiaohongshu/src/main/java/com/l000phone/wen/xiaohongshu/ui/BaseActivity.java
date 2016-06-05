package com.l000phone.wen.xiaohongshu.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.l000phone.wen.xiaohongshu.utils.AppManager;


public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getAppManager().addActivity(this);
        init();
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
