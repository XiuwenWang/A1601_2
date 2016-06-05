package com.l000phone.wen.liwushuo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.l000phone.wen.liwushuo.utils.ImageLoader;

import java.util.HashMap;
import java.util.List;

/**
 * 项目名称：MeiShi
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-20 11:58
 * 修改人：a.wen
 * 修改时间：2016-04-21 10:21
 * 修改备注：ViewHoloer修改成ViewHolder
 */

public abstract class AppBaseAdapter<T> extends BaseAdapter {
    public List<T> data;
    public Context context;

    public AppBaseAdapter(List<T> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //入口
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return createViewHolder(position, convertView, parent).getItemView();
    }
        
    public abstract ViewHolder createViewHolder(int position, View convertView, ViewGroup parent);

    public static class ViewHolder {
        private View convertView;
        private HashMap<Integer, View> views;
        private Context context;

        //第四步
        private ViewHolder(Context context, View convertView) {
            this.convertView = convertView;
            //保存View的map
            views = new HashMap<>();
            this.context = context;
            //设置tab
            convertView.setTag(this);
        }

        //第三步
        public static ViewHolder getHolder(View convertView, Context context, int layoutId, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(context);
                convertView = inflater.inflate(layoutId, parent, false);
                return new ViewHolder(context, convertView);
            } else {
                return (ViewHolder) convertView.getTag();
            }
        }

        //第六步
        public <T extends View> T findById(int id) {
            View view = views.get(id);
            if (view == null) {
                view = convertView.findViewById(id);
                views.put(id, view);

            } else {
                view = views.get(id);
            }
            return (T) view;
        }

        //第五步
        public void setText(int id, String txt) {
            TextView tv = findById(id);
            tv.setText(txt);
        }

        //第五步
        public void setRadiusImage(int id, String url,int radius) {
            ImageView img = findById(id);
            Glide.with(context).load(url).into(img);
//            ImageLoader.getInstance().displayRadiusImage(context,url,img,radius);
        }

        //加载圆形图片
        public void setCricleImage(int id, String url) {
            ImageView img = findById(id);
//            Glide.with(context).load(url).into(img);
            ImageLoader.getInstance().displayCricleImage(context,url,img);
        }

        public View getItemView() {
            return convertView;
        }

    }


}
