package com.l000phone.wen.liwushuo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.l000phone.wen.liwushuo.App;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.fragment.GuideFragment;
import com.l000phone.wen.liwushuo.fragment.CategoryFragment;
import com.l000phone.wen.liwushuo.fragment.HotFragment;
import com.l000phone.wen.liwushuo.fragment.MineFragment;
import com.l000phone.wen.liwushuo.utils.AppManager;
import com.l000phone.wen.liwushuo.utils.FragmentTabUtils;

import java.util.ArrayList;

import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements FragmentTabUtils.OnTabSelected {
    private long exitTime;
//    @BindView(R.id.rg_bottom_main)
     RadioGroup rgs;
    private ArrayList<Fragment> fragments = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        rgs = (RadioGroup)findViewById(R.id.rg_gb);
        fragments.add(GuideFragment.newInstance());
        fragments.add(HotFragment.newInstance("", ""));
        fragments.add(CategoryFragment.newInstance());
        fragments.add(MineFragment.newInstance("", ""));
        FragmentTabUtils fragmentTabUtils = new FragmentTabUtils(rgs,
                getSupportFragmentManager(),
                R.id.fl_main, fragments);


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
