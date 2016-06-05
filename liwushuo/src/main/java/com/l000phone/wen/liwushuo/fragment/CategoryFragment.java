package com.l000phone.wen.liwushuo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.l000phone.wen.liwushuo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends BaseFragment {
    public static CategoryFragment newInstance() {
        Bundle args = new Bundle();
        CategoryFragment fragment = new CategoryFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public CategoryFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frragment_category, container, false);
    }



    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void initView() {
        super.initView();
    }

}
