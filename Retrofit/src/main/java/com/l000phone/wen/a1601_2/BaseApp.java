package com.l000phone.wen.a1601_2;

import android.app.Application;

import com.l000phone.wen.a1601_2.utils.GalleryFinalManager;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/27
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class BaseApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        GalleryFinalManager.getInstance().init(this);
    }
}
