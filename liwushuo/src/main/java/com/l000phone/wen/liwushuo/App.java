package com.l000phone.wen.liwushuo;

import android.app.Application;
import android.app.WallpaperInfo;
import android.widget.Toast;

import com.l000phone.wen.liwushuo.netstate.NetChangeObserver;
import com.l000phone.wen.liwushuo.netstate.NetWorkUtil;
import com.l000phone.wen.liwushuo.netstate.NetworkStateReceiver;
import com.l000phone.wen.liwushuo.utils.FileUtils;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;
import okhttp3.Cache;

//import cn.finalteam.okhttpfinal.OkHttpFinal;
//import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;
//import okhttp3.Cache;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/5/5
 * 修改人：
 * 修改时间：2016/5/5
 * 修改备注：
 */
public class App extends Application {
    public static App app;
    //网络观察者
    private NetChangeObserver observer = new NetChangeObserver(){
        @Override
        public void onConnect(NetWorkUtil.NetType type) {
            showToast("网络已连接");
        }

        @Override
        public void onDisConnect() {
            showToast("网络已断开");
        }
    };
    private static WallpaperInfo instance;


    public static App getInstance() {
        return app;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initNet();
        configOkHttpFinal();
    }

    private void configOkHttpFinal() {
        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder();
        builder.setCache(new Cache(FileUtils.getRootFile(),1*1000));
        builder.setDebug(true);
        OkHttpFinal.getInstance().init(builder.build());
    }



    /**
     * 注册广播
     * 注册观察者
     */
    private void initNet() {
        NetworkStateReceiver.registerNetworkStateReceiver(this);
        NetworkStateReceiver.registerObserver(observer);
    }

    /**
     * 吐司一哈子
     * @param msg
     */
    public void showToast(String msg) {
        Toast.makeText(App.this, msg, Toast.LENGTH_SHORT).show();
    }

    public void unRegisterNetworkStateReceiver() {
        NetworkStateReceiver.unRegisterNetworkStateReceiver(this);
        if (observer != null) {
            NetworkStateReceiver.removeRegisterObserver(observer);
        }
    }
}
