package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.l000phone.wen.liwushuo.R;
import com.l000phone.wen.liwushuo.bean.RecyclerViewComment;
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
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyHolder> {

    private Context context;
    private List<RecyclerViewComment.DataBean.SecondaryBannersBean> recyclerViewList;

    public MyRecyclerAdapter(Context context, List<RecyclerViewComment.DataBean.SecondaryBannersBean> recyclerViewList) {
        this.context = context;
        this.recyclerViewList = recyclerViewList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        View view = from.inflate(R.layout.recycleriew_item, parent, false);
        MyHolder holder = new MyHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

//        ImageLoader.getInstance().displayRadiusImage(context,recyclerViewList.get(position).getImage_url(),holder.img,5);
        Glide.with(context).load(recyclerViewList.get(position)).into(holder.img);
    }


    @Override
    public int getItemCount() {
        return recyclerViewList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;

        public MyHolder(View itemView) {
            super(itemView);
//            itemView.setOnClickListener(this);
            img = (ImageView) itemView.findViewById(R.id.iv_img);
        }

//        //        点击事件
//        @Override
//        public void onClick(View v) {
////            if (onItemClickListener != null) {
////                onItemClickListener.onItemClick(null, v, MyHolder.this.getPosition(), MyHolder.this.getItemId());
////            }
//            if (listener != null) {
//                listener.itemClickListener(data.get(this.getPosition()));
//            }
//
//
//        }

    }


}
