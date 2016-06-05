package com.l000phone.wen.a1601_2.utils;

/**
 * ----------BigGod be here!----------/
 *
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
 *
 * ━━━━━━神兽出没━━━━━━
 *
 * 项目名称：TeachSample
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-11 17:52
 * 修改人：zhangwei
 * 修改时间：2016-04-11 17:52
 * 修改备注：
 */

public class ApiConstans {

    public static class RequestUrl {
        //基础url
        public static final String BASE_URL = "http://10.6.157.85:8080/api/v1.0/";
        //登录
        public static final String URL_LOGIN_POST = "account/login";
        //用户注销
        public static final String URL_LOGOUT_DELETE = "account/logout";
        //第三方登录
        public static final String URL_THREE_LOGIN_POST = "account/threeLogin";
        //头像上传
        public static final String URL_LOGIN_UPDATE_POST = "account/image";
        //多文件上传路径
        public static final String URL_UPDATE_FILES_POST = "account/files";
        //查询所有用户
        public static final String URL_USER_LIST_GET = "account/list/{page}/{size}";
        //查询订单信息
        public static final String URL_ORDERS_GET = "account/orders";
        //注册用户
        public static final String URL_REGISTER_POST = "account/register";

        //修改用户信息
        public static final String URL_UPDATE_POST = "account/update";


    }

    public static class RequestParmasKey {
        //登陆用户名
        public static final String KEY_USER_NAME = "username";
        //登陆用户密码
        public static final String KEY_PWD = "pwd";
        //注册
        public static final String KEY_USER = "user";
        //第三方登陆
        public static final String KEY_OPEN_ID = "openId";

        public static final String KEY_NAME = "name";
        public static final String KEY_USER_ICON = "userIcon";
        public static final String KEY_PALTFORM = "paltform";
        //用户头像上传
        public static final String KEY_UID = "uid";
        public static final String KEY_FILE = "file";
        //分页
        public static final String KEY_OFFSET = "offset";
        public static final String KEY_LIMIT = "limit";
        public static final String KEY_MULTI_FILE = "files";
        public static final String KEY_MULTI_DES = "des";

    }


}
