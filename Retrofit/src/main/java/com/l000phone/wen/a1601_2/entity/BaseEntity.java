package com.l000phone.wen.a1601_2.entity;

/**
 * 项目名称：TeachSample
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-04-11 17:13
 * 修改人：zhangwei
 * 修改时间：2016-04-11 17:13
 * 修改备注：
 */

public class BaseEntity {
    private String state;
    private String msg;
    private User data;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "BaseEntity{" +
                "state='" + state + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
