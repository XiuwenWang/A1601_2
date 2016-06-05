package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.bean.ListViewComment;
import com.l000phone.wen.liwushuo.fragment.guidefragment.HeartFragment;

import java.util.Date;
import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/22
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MyLvAdapter extends AppBaseAdapter<ListViewComment.DataBean.ItemsBean> {

private HeartFragment heartFragment;
    public MyLvAdapter(List data, Context context, HeartFragment heartFragment) {
        super(data, context);
        this.heartFragment = heartFragment;
    }

    @Override
    public ViewHolder createViewHolder(int position, View convertView, ViewGroup parent) {
        if(data.size()-1 == position){
            heartFragment.initListViewData();
        }
        ViewHolder viewHolder = ViewHolder.getHolder(convertView,context, R.layout.player_item_lv,parent);
        viewHolder.setText(R.id.tv_title,data.get(position).getTitle());
        viewHolder.setText(R.id.tv_praise,data.get(position).getLikes_count()+"");
        viewHolder.setRadiusImage(R.id.iv_comments_avatar,data.get(position).getCover_image_url(),20);
        return viewHolder;
    }
    public interface CallBack{
        void initListViewData();
    }

}
