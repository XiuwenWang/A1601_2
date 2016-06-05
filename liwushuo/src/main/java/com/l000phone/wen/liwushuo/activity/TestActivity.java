package com.l000phone.wen.liwushuo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.bean.ViewPagerComment;
import com.l000phone.wen.liwushuo.config.ApiConstants;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import okhttp3.Headers;

public class TestActivity extends BaseActivity {

    @BindView(R.id.convenientBanner)
    ConvenientBanner convenientBanner;
    private List<String> localImages = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        initData();

        //自定义你的Holder，实现更多复杂的界面，不一定是图片翻页，其他任何控件翻页亦可。
        convenientBanner.setPages(new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, localImages)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
//                .setPageIndicator(new int[]{R.drawable.ic_page_indicator, R.drawable.ic_page_indicator_focused})
                //设置指示器的方向
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT)
                //设置翻页的效果，不需要翻页效果可用不设
                //.setPageTransformer(Transformer.DefaultTransformer);    集成特效之后会有白屏现象，新版已经分离，如果要集成特效的例子可以看Demo的点击响应。
                .setManualPageable(false);//设置不能手动影响



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
            Glide.with(getBaseContext()).load(url).into(imageView);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        convenientBanner.startTurning(2000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        convenientBanner.stopTurning();
    }

    @Override
    public void initData() {
        HttpRequest.get(ApiConstants.RequestPath.VIEWPAGER_URL,new BaseHttpRequestCallback<ViewPagerComment>(){
            @Override
            protected void onSuccess(Headers headers, ViewPagerComment viewPagerComment) {
                List<ViewPagerComment.DataBean.BannersBean> banners = viewPagerComment.getData().getBanners();
                localImages.clear();
                for (ViewPagerComment.DataBean.BannersBean banner:
                        banners) {
                    String image_url = banner.getImage_url();
                    localImages.add(image_url);
                }

            }

            @Override
            public void onFinish() {
                convenientBanner.notifyDataSetChanged();

            }

            @Override
            public void onFailure(int errorCode, String msg) {

            }
        });
    }
}
