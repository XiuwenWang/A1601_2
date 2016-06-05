package com.l000phone.wen.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.l000phone.wen.recyclerview.R;

import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/28
 * 修改人：
 * 修改时间：2016/4/28
 * 修改备注：
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<String> data;


    public MyAdapter(List<String> data) {
        this.data = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView = (TextView) itemView.findViewById(R.id.tv_card_view);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public interface ItemOnClickLister{
        void itemClickListener(String str);
    }

}
