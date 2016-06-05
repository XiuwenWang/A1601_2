package com.l000phone.wen.liwushuo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.adapter.HotMyRecyclerViewAdapter;
import com.l000phone.wen.liwushuo.adapter.TAG;
import com.l000phone.wen.liwushuo.bean.HotGv;
import com.l000phone.wen.liwushuo.config.ApiConstants;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import okhttp3.Headers;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotFragment extends BaseFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    @BindView(R.id.pullLoadMoreRecyclerView)
    PullLoadMoreRecyclerView pullLoadMoreRecyclerView;


    private String mParam1;
    private String mParam2;

    private HotMyRecyclerViewAdapter adapter;
    private HotGv mHotGv;
    private View inflate;


    public HotFragment() {
        // Required empty public constructor
    }


    public static HotFragment newInstance(String param1, String param2) {
        HotFragment fragment = new HotFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.fragment_hot, container, false);
        ButterKnife.bind(this, inflate);
        initData();








        return inflate;
    }

    @Override
    public void initData() {
        HttpRequest.get(ApiConstants.RequestPath.HOT_URL, new BaseHttpRequestCallback<HotGv>() {
            @Override
            protected void onSuccess(Headers headers, HotGv hotGv) {

                mHotGv = hotGv;


                pullLoadMoreRecyclerView = (PullLoadMoreRecyclerView) inflate.findViewById(R.id.pullLoadMoreRecyclerView);
                pullLoadMoreRecyclerView.setGridLayout(2);//参数为列数
                adapter = new HotMyRecyclerViewAdapter(getContext(), mHotGv);
                pullLoadMoreRecyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

//                pullLoadMoreRecyclerView.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
//                    @Override
//                    public void onRefresh() {
//                        initData();
//                    }
//
//                    @Override
//                    public void onLoadMore() {
//                        initData();
//                    }
//                });


            }

            @Override
            public void onFinish() {
                pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
            }
        });
    }
}
