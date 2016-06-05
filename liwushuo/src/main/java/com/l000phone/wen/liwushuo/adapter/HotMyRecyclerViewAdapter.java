package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.bean.HotGv;
import com.l000phone.wen.liwushuo.utils.ImageLoader;

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
public class HotMyRecyclerViewAdapter extends RecyclerView.Adapter<HotMyRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private HotGv data;

    public HotMyRecyclerViewAdapter(Context context,HotGv data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pullloadmorerecycleriew_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String cover_image_url = data.getData().getItems().get(position).getData().getCover_image_url();
        Log.i(TAG.getClassName(this), "onBindViewHolder:data.getData().getItems().get(position).getData().getCoverImageUrl() =  "+ cover_image_url);
        Glide.with(context).load(cover_image_url)
                .centerCrop().into(holder.img);
//        ImageLoader.getInstance().displayRadiusImage(context, cover_image_url,holder.img,0);
    }

    @Override
    public int getItemCount() {
        return data.getData().getItems().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.iv_item);
        }
    }
}
