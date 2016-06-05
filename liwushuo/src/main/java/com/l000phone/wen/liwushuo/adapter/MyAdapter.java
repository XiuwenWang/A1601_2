package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;


import com.l000phone.wen.liwushuo.fragment.guidefragment.HeartFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/25.
 */
public class MyAdapter extends PagerAdapter {
    private ArrayList<View> viewList;
    private Context context;
    private List<String> list;

    public MyAdapter(Context context, ArrayList viewList) {
        this.context = context;
        this.viewList = viewList;
    }

    public MyAdapter(Context context, ArrayList viewList,List<String> list) {
        this.context = context;
        this.viewList = viewList;
        this.list = list;
    }


    public MyAdapter(ArrayList<View> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList == null ? 0 : viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (View) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = null;
        if (viewList != null) {
            view = viewList.get(position);
            container.addView(view);
        }
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = null;
        if (viewList != null) {
            view = viewList.get(position);
            container.removeView(view);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
