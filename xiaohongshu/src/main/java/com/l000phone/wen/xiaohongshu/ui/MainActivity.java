package com.l000phone.wen.xiaohongshu.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.widget.RadioGroup;

import com.l000phone.wen.xiaohongshu.App;
import com.l000phone.wen.xiaohongshu.R;
import com.l000phone.wen.xiaohongshu.fragment.HotFragment;
import com.l000phone.wen.xiaohongshu.fragment.TestFragment;
import com.l000phone.wen.xiaohongshu.ui.BaseActivity;
import com.l000phone.wen.xiaohongshu.utils.AppManager;
import com.l000phone.wen.xiaohongshu.utils.FragmentTabUtils;

import java.util.ArrayList;

/**
 *
 *
 *
 *
 */
public class MainActivity extends BaseActivity implements FragmentTabUtils.OnTabSelected {
    private long exitTime;

     RadioGroup rgs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(TestFragment.newInstance());
        fragments.add(HotFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        new FragmentTabUtils(rgs, getSupportFragmentManager(), R.id.fragment_container, fragments);




    }

    @Override
    public void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void initData() {
    }


    //监听返回按钮
    @Override
    public void onBackPressed() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            App.getInstance().showToast("在按一次退出");
            exitTime = System.currentTimeMillis();
        } else {
            AppManager.getAppManager().AppExit(App.getInstance());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().unRegisterNetworkStateReceiver();
    }

    @Override
    public void onTabSelected(RadioGroup group, int checkId, int currentIndex) {

    }
}
