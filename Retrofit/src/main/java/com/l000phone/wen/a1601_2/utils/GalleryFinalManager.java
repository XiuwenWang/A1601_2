package com.l000phone.wen.a1601_2.utils;

import android.content.Context;

import java.util.ArrayList;

import cn.finalteam.galleryfinal.CoreConfig;
import cn.finalteam.galleryfinal.FunctionConfig;
import cn.finalteam.galleryfinal.GalleryFinal;
import cn.finalteam.galleryfinal.ImageLoader;
import cn.finalteam.galleryfinal.ThemeConfig;


/**
 * ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 *
 * 项目名称：wh1601
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-26 20:25
 * 修改人：zhangwei
 * 修改时间：2016-04-26 20:25
 * 修改备注：
 */
public class GalleryFinalManager {
    private static volatile GalleryFinalManager mInstance;
    private ArrayList<String> selectedList = new ArrayList<>();
    private GalleryFinalManager() {

    }

    public static GalleryFinalManager getInstance() {
        GalleryFinalManager instance = mInstance;
        if (instance == null) {
            synchronized (GalleryFinalManager.class) {
                if (instance == null) {
                    instance = new GalleryFinalManager();
                    mInstance = instance;
                }
            }
        }
        return instance;
    }

    /**
     * 步骤一  设置主题
     * 步骤二  设置核心配置
     * 步骤二  初始化配置
     *
     * @param context
     */
    public void init(Context context) {
        //配置imageloader
        ImageLoader imageloader = new GlideImageLoader();
        CoreConfig coreConfig = new CoreConfig.Builder(context, imageloader, ThemeConfig.GREEN)
                .setFunctionConfig(getFunctionCofig())
                .build();
        GalleryFinal.init(coreConfig);

    }

    /**
     * setMutiSelect(boolean)//配置是否多选
     * setMutiSelectMaxSize(int maxSize)//配置多选数量
     * setEnableEdit(boolean)//开启编辑功能
     * setEnableCrop(boolean)//开启裁剪功能
     * setEnableRotate(boolean)//开启旋转功能
     * setEnableCamera(boolean)//开启相机功能
     * setCropWidth(int width)//裁剪宽度
     * setCropHeight(int height)//裁剪高度
     * setCropSquare(boolean)//裁剪正方形
     * setSelected(List)//添加已选列表,只是在列表中默认被选中不会过滤图片
     * setFilter(List list)//添加图片过滤，也就是不在GalleryFinal中显示
     * takePhotoFolter(File file)//配置拍照保存目录，不做配置的话默认是/sdcard/DCIM/GalleryFinal/
     * setRotateReplaceSource(boolean)//配置选择图片时是否替换原始图片，默认不替换
     * setCropReplaceSource(boolean)//配置裁剪图片时是否替换原始图片，默认不替换
     * setForceCrop(boolean)//启动强制裁剪功能,一进入编辑页面就开启图片裁剪，不需要用户手动点击裁剪，此功能只针对单选操作
     * setForceCropEdit(boolean)//在开启强制裁剪功能时是否可以对图片进行编辑（也就是是否显示旋转图标和拍照图标）
     * setEnablePreview(boolean)//是否开启预览功能
     */
    public FunctionConfig getFunctionCofig() {
        //配置功能
        FunctionConfig functionConfig = new FunctionConfig.Builder()
                //开启编辑功能
                .setEnableEdit(true)
                //开启裁剪功能
                .setEnableCrop(true)
                //裁剪高度
                .setCropHeight(150)//裁剪高度
                .setCropWidth(150)//裁剪宽度
                .setCropSquare(true)//裁剪正方形
                .setEnableCamera(true)//开启相机
                .setEnablePreview(true)//开启预览功能
                .setEnableRotate(true)//开启旋转图片
                .setForceCrop(true)//开启强制裁剪功能
                .setSelected(selectedList)
                .setForceCropEdit(true)//开启强制裁剪后是否可以编辑
                .build();
        return functionConfig;
    }

    /**
     * setTitleBarTextColor//标题栏文本字体颜色
     * setTitleBarBgColor//标题栏背景颜色
     * setTitleBarIconColor//标题栏icon颜色，如果设置了标题栏icon，设置setTitleBarIconColor将无效
     * setCheckNornalColor//选择框未选颜色
     * setCheckSelectedColor//选择框选中颜色
     * setCropControlColor//设置裁剪控制点和裁剪框颜色
     * setFabNornalColor//设置Floating按钮Nornal状态颜色
     * setFabPressedColor//设置Floating按钮Pressed状态颜色
     * setIconBack//设置返回按钮icon
     * setIconCamera//设置相机icon
     * setIconCrop//设置裁剪icon
     * setIconRotate//设置旋转icon
     * setIconClear//设置清楚选择按钮icon（标题栏清除选择按钮）
     * setIconFolderArrow//设置标题栏文件夹下拉arrow图标
     * setIconDelete//设置多选编辑页删除按钮icon
     * setIconCheck//设置checkbox和文件夹已选icon
     * setIconFab//设置Floating按钮icon
     * setEditPhotoBgTexture//设置图片编辑页面图片margin外背景
     * setIconPreview设置预览按钮icon
     * setPreviewBg设置预览页背景
     */
    public ThemeConfig getFunctionTheme() {
        ThemeConfig theme = new ThemeConfig.Builder()
                .setTitleBarBgColor(android.R.attr.colorPrimary)
                .build();
        return theme;
    }

}