package com.l000phone.wen.a1601_2.utils;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.l000phone.wen.a1601_2.R;

import cn.finalteam.galleryfinal.widget.GFImageView;


public class GlideImageLoader implements cn.finalteam.galleryfinal.ImageLoader {

    @Override
    public void displayImage(Activity activity, String path, final GFImageView imageView, Drawable defaultDrawable, int width, int height) {
        Glide.with(activity)
                .load("file://" + path)
                .placeholder(defaultDrawable)
                .error(defaultDrawable)
                .override(width, height)
                .diskCacheStrategy(DiskCacheStrategy.NONE) //不缓存到SD卡
                .skipMemoryCache(true)
                //.centerCrop()
                .into(new ImageViewTarget<GlideDrawable>(imageView) {
                    @Override
                    protected void setResource(GlideDrawable resource) {
                        imageView.setImageDrawable(resource);
                    }


                    public void setRequest(DownloadManager.Request request) {
                        imageView.setTag(1, request);
                    }

                    @Override
                    public Request getRequest() {
                        return (Request) imageView.getTag(1);
                    }
                });
    }

    @Override
    public void clearMemoryCache() {
    }
}