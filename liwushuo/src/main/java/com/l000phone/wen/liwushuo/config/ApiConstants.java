package com.l000phone.wen.liwushuo.config;

/**
 * 项目名称：小红书
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/28
 * 修改人：
 * 修改时间：2016/4/28
 * 修改备注：
 */
public class ApiConstants {

    public static final class RequestPath {


        /**
         * 指南
         * 首页广告      http://api.liwushuo.com/v2/banners
         * 推荐:        http://api.liwushuo.com/v2/secondary_banners?gender=1&generation=4
         * 首页顶部Tab: http://api.liwushuo.com/v2/channels/preset?gender=1&generation=4
         * <p/>
         * 主数据源 http://api.liwushuo.com/v2/channels/26/items?limit=20&offset=0&gender=1&generation=4
         * 热门 http://api.liwushuo.com/v2/items?limit=20&offset=0&gender=1&generation=4
         */

        /**
         * 基础Url
         */
        public static final String BASE_URL = "http://api.liwushuo.com/v2/";
        public static final String CHANNELS = "channels/";
        public static final String ITEMS = "/items";
        public static final String STERN = "?limit=20&offset=0&gender=1&generation=4";

        /**
         * 首页顶部Tab
         */
        public static final String GUIDE_TAB_LAYOUT_URL = "http://api.liwushuo.com/v2/channels/preset?gender=1&generation=4";

        /**
         * 推荐recyclerView_url:
         */
        public static final String RECYCLER_VIEW_URL = "http://api.liwushuo.com/v2/secondary_banners?gender=1&generation=4";

        /**
         * 广告栏：viewpager_url:
         */
        public static final String VIEWPAGER_URL = "http://api.liwushuo.com/v2/banners";
        /**
         * 下拉列表：EXPANDABLE_LIST_VIEW_URL
         */
        public static final String EXPANDABLE_LIST_VIEW_URL = "http://api.liwushuo.com/v2/channels/26/items?limit=20&offset=0&gender=1&generation=4";
        /**
         * 热门：HOT_URL
         */
        public static final String HOT_URL = "http://api.liwushuo.com/v2/items?limit=20&offset=0&gender=1&generation=4";


    }
}
