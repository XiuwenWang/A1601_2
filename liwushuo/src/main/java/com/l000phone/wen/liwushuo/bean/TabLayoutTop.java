package com.l000phone.wen.liwushuo.bean;

import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/5/5
 * 修改人：
 * 修改时间：2016/5/5
 * 修改备注：
 */
public class TabLayoutTop {

    /**
     * code : 200
     * data : {"candidates":[{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":10,"name":"送女票"},{"editable":true,"id":5,"name":"送闺蜜"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":24,"name":"送宝贝"},{"editable":true,"id":126,"name":"奇葩搞怪"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":14,"name":"文艺风"},{"editable":true,"id":11,"name":"萌萌哒"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":28,"name":"科技范"}],"channels":[{"editable":false,"id":108,"name":"精选"},{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":10,"name":"送女票"},{"editable":true,"id":5,"name":"送闺蜜"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":24,"name":"送宝贝"},{"editable":true,"id":126,"name":"奇葩搞怪"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":14,"name":"文艺风"},{"editable":true,"id":11,"name":"萌萌哒"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":28,"name":"科技范"}]}
     * message : OK
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * editable : true
         * id : 26
         * name : 送基友
         */

        private List<CandidatesBean> candidates;
        /**
         * editable : false
         * id : 108
         * name : 精选
         */

        private List<ChannelsBean> channels;

        public List<CandidatesBean> getCandidates() {
            return candidates;
        }

        public void setCandidates(List<CandidatesBean> candidates) {
            this.candidates = candidates;
        }

        public List<ChannelsBean> getChannels() {
            return channels;
        }

        public void setChannels(List<ChannelsBean> channels) {
            this.channels = channels;
        }

        public static class CandidatesBean {
            private boolean editable;
            private int id;
            private String name;

            public boolean isEditable() {
                return editable;
            }

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class ChannelsBean {
            private boolean editable;
            private int id;
            private String name;

            public boolean isEditable() {
                return editable;
            }

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
