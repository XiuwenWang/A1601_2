package com.wei.design;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.item_tv);
        }
    }