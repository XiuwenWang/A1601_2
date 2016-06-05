package com.l000phone.wen.xiaohongshu.config;

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
         * 首页
         */
        public static final String HOME_URL = "http://www.xiaohongshu.com/api/sns/v2/homefeed?filter=&value=simple&platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461844878&sign=6015a0b5df2610bb8f4474a1ae233e33";

        /**
         * 发现
         */
        public static final String SEARCH_URL = "http://www.xiaohongshu.com/api/sns/v2/explore/banner?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461847056&sign=f6f196f698b1166c04454932aa459ef1";

        /**
         * 想玩户外运动，得备齐这些
         */
        public static final String SPORT_CONTENT_URL = "http://www.xiaohongshu.com/api/sns/v2/note/board/571b3d137fc5b859c7d7aa52?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461855693&sign=a757d27ee6d597b69b34f689da768dba";
        public static final String SPORT_TITLE_URL = "http://www.xiaohongshu.com/api/sns/v1/board/571b3d137fc5b859c7d7aa52?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461855990&sign=d0dc35220acef2371a3d2b550fd80631";

        /**
         * 这些网红美食，排长队也要吃
         */
        public static final String FOOD_TITLE_PATH = "http://www.xiaohongshu.com/api/sns/v1/board/57209646a9b2ed2e9c4d96c3?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461855775&sign=5f1ae117f31913ba65777b74c988be3a";
        public static final String FOOD_CONTENT_PATH = "http://www.xiaohongshu.com/api/sns/v2/note/board/57209646a9b2ed2e9c4d96c3?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461855775&sign=5f1ae117f31913ba65777b74c988be3a";

        /**
         * 撞衫太可怕，就穿这些牌子
         */
        public static final String CLOTHES_TITLE_URL = "http://www.xiaohongshu.com/api/sns/v1/board/571f2415a9b2ed73aca4f8d9?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461856259&sign=ba36bbac711446f820ac750366e3b1b5";
        public static final String CLOTHES_CONTENT_URL = "http://www.xiaohongshu.com/api/sns/v2/note/board/571f2415a9b2ed73aca4f8d9?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461856259&sign=ba36bbac711446f820ac750366e";

        /**
         * 时装周后台都在用的美妆神器
         */
        public static final String COSMETIC_TITLE_URL = "http://www.xiaohongshu.com/api/sns/v1/board/571e012c34609435cd00d64b?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461856571&sign=c18d77654a9e9339595f738ce4e3e923";
        public static final String COSMETIC_CONTENT_URL = "http://www.xiaohongshu.com/api/sns/v2/note/board/571e012c34609435cd00d64b?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461856571&sign=c18d77654a9e9339595f738ce4e3e923";

        /**
         * 我的
         */
        public static final String MY_URL = "http://www.xiaohongshu.com/api/sns/v1/user/me?platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461847645&sign=b8bf742972bce4a63832b812834d28c1";

        /**
         * 专题活动
         */
        public static final String MESSAGE_URL = "http://www.xiaohongshu.com/api/sns/v3/message?type=activities&num=20&platform=Android&source=discovery&deviceId=e1466959-a382-38e0-bc80-a1282c0eff8e&versionName=4.4.100&channel=YingYongBao&sid=session.1146254432151300964&lang=zh-Hans&t=1461847755&sign=786232a008596941b28da066aa725a1c";

    }
}
