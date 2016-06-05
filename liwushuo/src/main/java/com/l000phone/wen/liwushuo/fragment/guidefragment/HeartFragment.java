package com.l000phone.wen.liwushuo.fragment.guidefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.activity.TestActivity;
import com.l000phone.wen.liwushuo.adapter.MyLvAdapter;
import com.l000phone.wen.liwushuo.adapter.MyPagerAdapter;
import com.l000phone.wen.liwushuo.adapter.MyRecyclerAdapter;
import com.l000phone.wen.liwushuo.bean.ListViewComment;
import com.l000phone.wen.liwushuo.bean.RecyclerViewComment;
import com.l000phone.wen.liwushuo.bean.ViewPagerComment;
import com.l000phone.wen.liwushuo.config.ApiConstants;
import com.l000phone.wen.liwushuo.fragment.BaseFragment;
import com.l000phone.wen.liwushuo.utils.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import okhttp3.Headers;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeartFragment extends BaseFragment implements MyLvAdapter.CallBack {

    @BindView(R.id.convenientBanner)
    ConvenientBanner convenientBanner;
    @BindView(R.id.rv_head)
    RecyclerView rvHead;
    ListView lv;

    private List<View> viewList = new ArrayList<>();
    private MyPagerAdapter pagerAdapter;
    private List<ListViewComment.DataBean.ItemsBean> dataList = new ArrayList();
    public List dataViewPager = new ArrayList();
    private MyLvAdapter lvAdapter;
    private MyRecyclerAdapter recyclerAdapter;
    private View headView;
    private List localImages = new ArrayList();
    private List recyclerViewList = new ArrayList();
    private ListViewComment listComment;
    private String id;


    public static HeartFragment newInstance(String id) {

        Bundle args = new Bundle();
        args.putString("id", id);
        HeartFragment HeartFragment = new HeartFragment();
        HeartFragment.setArguments(args);
        return HeartFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getString("id");
        }
    }


    public HeartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_heart, container, false);
//        ButterKnife.bind(this,view);
        initView(view);
        headView = LayoutInflater.from(getContext()).inflate(R.layout.listview_head, null);
        ButterKnife.bind(this, headView);

        //加载数据
        initData();


        setListView();

        return view;
    }

    //设置listView
    private void setListView() {
        Log.i("wang", "setListView: "+id.toString());
        if (id.equals("108")) {
            addHead();
            lv.addHeaderView(headView);
        }
        lvAdapter = new MyLvAdapter(dataList, getContext(), this);
        lv.setAdapter(lvAdapter);
    }

    //添加头部
    private void addHead() {
        setViewPager();
        setRecyclerView();

    }

    //设置头部RecyclerView
    private void setRecyclerView() {
        //设置布局管理器
        rvHead.setLayoutManager(getLinearLayoutManager());

        recyclerAdapter = new MyRecyclerAdapter(getContext(), recyclerViewList);
        rvHead.setAdapter(recyclerAdapter);
    }

    //设置头部ViewPager
    private void setViewPager() {
        //自定义你的Holder，实现更多复杂的界面，不一定是图片翻页，其他任何控件翻页亦可。
        convenientBanner.setPages(
                new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, localImages)
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT)
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused});


    }

    /**
     * 获得RecyclerView的布局管理器
     * @return
     */
    private LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager llm;
        llm = new LinearLayoutManager(getContext());
        //设置水平
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
//        glm = new GridLayoutManager()
        return llm;
    }

    /**
     * 加载各个控件的数据
     */
    @Override
    public void initData() {

        if (id.equals("108")) {
            //加载广告栏的数据
            initViewPagerData();
            //加载RecyclerView的数据
            initRecyclerViewData();
        }

        //加载listView的数据
        initListView(ApiConstants.RequestPath.BASE_URL
                + ApiConstants.RequestPath.CHANNELS
                + id
                + ApiConstants.RequestPath.ITEMS
                + ApiConstants.RequestPath.STERN);


    }

    //加载RecyclerView的数据
    private void initRecyclerViewData() {
        HttpRequest.get(ApiConstants.RequestPath.RECYCLER_VIEW_URL, new BaseHttpRequestCallback<RecyclerViewComment>() {
            @Override
            protected void onSuccess(Headers headers, RecyclerViewComment recyclerViewComment) {
                List<RecyclerViewComment.DataBean.SecondaryBannersBean> secondary_banners = recyclerViewComment.getData().getSecondary_banners();
                recyclerViewList.clear();
                for (RecyclerViewComment.DataBean.SecondaryBannersBean secondary_banner :
                        secondary_banners) {
                    recyclerViewList.add(secondary_banner.getImage_url());

                }
                recyclerAdapter.notifyDataSetChanged();
            }
        });
    }

    private void initViewPagerData() {
        HttpRequest.get(ApiConstants.RequestPath.VIEWPAGER_URL, new BaseHttpRequestCallback<ViewPagerComment>() {
            @Override
            protected void onSuccess(Headers headers, ViewPagerComment viewPagerComment) {
                List<ViewPagerComment.DataBean.BannersBean> banners = viewPagerComment.getData().getBanners();
                localImages.clear();
                for (ViewPagerComment.DataBean.BannersBean banner :
                        banners) {
                    String image_url = banner.getImage_url();
                    localImages.add(image_url);
                }
            }

            @Override
            public void onFinish() {
                convenientBanner.notifyDataSetChanged();

            }

        });
    }

//    private void initViewPager() {
//
//        HttpRequest.get(ApiConstants.RequestPath.VIEWPAGER_URL, new BaseHttpRequestCallback<String>() {
//
//            @Override
//            protected void onSuccess(Headers headers, String result) {
//                Gson gson = new Gson();
//                ViewPagerComment viewPagerComment = gson.fromJson(result, ViewPagerComment.class);
//                List<ViewPagerComment.DataBean.BannersBean> banners = viewPagerComment.getData().getBanners();
//                dataViewPager.clear();
//                viewList.clear();
//                for (ViewPagerComment.DataBean.BannersBean banner :
//                        banners) {
//                    String image_url = banner.getImage_url();
//                    dataViewPager.add(image_url);
//                    viewList.add(LayoutInflater.from(getContext()).inflate(R.layout.viewpager_head, null));
//                }
//
//                pagerAdapter.notifyDataSetChanged();
//                for (View v :
//                        viewList) {
//                    ImageView img = (ImageView) v.findViewById(R.id.iv_vpHead);
//                    String url = (String) dataViewPager.get(viewList.indexOf(v));
//                    ImageLoader.getInstance().displayCricleImage(getContext(), url, img);
//
//                }
//            }
//
//            @Override
//            public void onFailure(int errorCode, String msg) {
//                super.onFailure(errorCode, msg);
//            }
//        });
//
//    }

    private void initListView(String url) {
        HttpRequest.get(url, new BaseHttpRequestCallback<ListViewComment>() {
            @Override
            protected void onSuccess(Headers headers, ListViewComment listViewComment) {
                listComment = listViewComment;

                List<ListViewComment.DataBean.ItemsBean> items = listViewComment.getData().getItems();

                dataList.clear();
                dataList.addAll(items);
                lvAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFinish() {
                super.onFinish();
            }

            @Override
            public void onFailure(int errorCode, String msg) {

            }
        });
    }

    @Override
    public void initListViewData() {
        String url = listComment.getData().getPaging().getNext_url();
        initListView(url);
    }

    public class LocalImageHolderView implements Holder<String> {
        private ImageView imageView;

        @Override
        public View createView(Context context) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return imageView;
        }

        @Override
        public void UpdateUI(Context context, final int position, String url) {
            Glide.with(getContext()).load(url).into(imageView);
        }
    }


    public void initView(View view) {
        lv = (ListView) view.findViewById(R.id.expandable_lv);
    }

    @Override
    public void onResume() {
        super.onResume();
        convenientBanner.startTurning(2000);
    }

    @Override
    public void onStop() {
        super.onStop();
        convenientBanner.stopTurning();
    }
}
