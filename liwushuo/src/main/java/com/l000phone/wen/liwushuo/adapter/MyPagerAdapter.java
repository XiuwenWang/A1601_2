package com.l000phone.wen.liwushuo.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/5/5
 * 修改人：
 * 修改时间：2016/5/5
 * 修改备注：
 */
public class MyPagerAdapter extends PagerAdapter {
    private List<View> stringList;

    public MyPagerAdapter(List<View> stringList) {
        this.stringList = stringList;
    }

    @Override
    public int getCount() {
        return stringList == null ? 0 : stringList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(stringList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View child = stringList.get(position);
        container.addView(child);
        return child;
    }
}
