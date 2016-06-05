package com.l000phone.wen.liwushuo.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.adapter.MyFragmentAdapter;
import com.l000phone.wen.liwushuo.api.ApiServer;
import com.l000phone.wen.liwushuo.bean.TabLayoutTop;
import com.l000phone.wen.liwushuo.config.ApiConstants;
import com.l000phone.wen.liwushuo.fragment.guidefragment.HeartFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragment extends BaseFragment {

    @BindView(R.id.ty_top_main)
    TabLayout tyTopMain;
    @BindView(R.id.vp_fragment)
    ViewPager vpFragment;
    private List<String> titleList = new ArrayList<>();
    private View inflate;
    private MyFragmentAdapter adapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List idList = new ArrayList();
    private String id;


    public static GuideFragment newInstance() {
        Bundle args = new Bundle();
        GuideFragment fragment = new GuideFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public GuideFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.fragment_guide, container, false);
        ButterKnife.bind(this, inflate);
        initData();


        return inflate;
    }

    @Override
    public void initData() {
//        retrofit();

        HttpRequest.get(ApiConstants.RequestPath.GUIDE_TAB_LAYOUT_URL, new BaseHttpRequestCallback<String>() {
            @Override
            protected void onSuccess(Headers headers, String result) {
                parse(result);
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                super.onFailure(errorCode, msg);
            }

            @Override
            public void onFinish() {
                super.onFinish();
            }
        });


    }

    private void retrofit() {
        //实例化 Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.RequestPath.BASE_URL)//必要参数 baseUrl
                //添加转化器
//                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit.create(ApiServer.class).headerList(1, 4).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String result = response.body();
                parse(result);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }

    private void parse(String result) {

        Gson gson = new Gson();
        TabLayoutTop tab = gson.fromJson(result, TabLayoutTop.class);

        if (tab != null) {
            List<TabLayoutTop.DataBean.ChannelsBean> channels = tab.getData().getChannels();
            //添加Titlelist
            titleList.clear();
            for (TabLayoutTop.DataBean.ChannelsBean n :
                    channels) {
                titleList.add(n.getName());
                idList.add(n.getId());
            }
            //添加fragmentList
            fragmentList.clear();
            for (int i = 0; i < titleList.size(); i++) {

                if (fragmentList.size() != titleList.size()) {
                    fragmentList.add(HeartFragment.newInstance(idList.get(i)+""));
                }
            }
        }
        tyTopMain.setTabMode(TabLayout.MODE_SCROLLABLE);
        adapter = new MyFragmentAdapter(getChildFragmentManager(), fragmentList, titleList);
        vpFragment.setAdapter(adapter);
        tyTopMain.setupWithViewPager(vpFragment);
        adapter.notifyDataSetChanged();
    }

}
