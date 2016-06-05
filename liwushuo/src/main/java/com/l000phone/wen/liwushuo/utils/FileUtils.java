package com.l000phone.wen.liwushuo.utils;

import android.os.Environment;


import com.l000phone.wen.liwushuo.App;

import java.io.File;

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
 * 项目名称：XiaoHongShu
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-28 15:17
 * 修改人：zhangwei
 * 修改时间：2016-04-28 15:17
 * 修改备注：
 */

public class FileUtils {
    public static final String DEFAULT_JSON_CACHE = "json";

    public static File getRootFile() {
        String path;

        //主要兼容3.0以下下的系统
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            //sdk/android/data/包名/cache/json
//            App.getInstance().getExternalFilesDir(DEFAULT_JSON_CACHE);
            //sdk/xiao
            path = Environment.getExternalStorageDirectory() + File.separator + AppConfig.ROOT_FILE;
        } else {
            //sys/data/data/包名/cache/json
            path = Environment.
                    getDataDirectory() + App.getInstance().getPackageName();

        }


        File rootFile = new File(path);
        if (!rootFile.exists()) {
            rootFile.mkdir();
        }
        return rootFile;
    }

    public static File getJsonFile() {
        String patht = getRootFile() + File.separator + AppConfig.JSON_CACHE;

        File jsonFile = new File(patht);
        if (!jsonFile.exists()) {
            jsonFile.mkdir();
        }
        return jsonFile;

    }


}
