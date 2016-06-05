package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import com.l000phone.wen.liwushuo.bean.TabLayoutTop;

import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/20
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MyFragmentAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> titleList;

    public MyFragmentAdapter(FragmentManager fm,List<Fragment> fragmentList
            ,List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
app:tabIndicatorColor="@color/colorPrimary"
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = fragmentList == null ? null : fragmentList.get(position);
        return fragment;

    }

    @Override
    public int getCount() {
        return fragmentList==null?0:fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position % titleList.size());
    }
}
