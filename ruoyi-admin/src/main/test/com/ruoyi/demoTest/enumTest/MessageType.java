package com.ruoyi.demoTest.enumTest;
public enum MessageType {
    SYSTEM_MESSAGE(1, "系统消息"),
    COMMENT_MESSAGE(2, "评论消息"),
    COLLECT_MESSAGE(3, "收藏消息");

    private Integer code;
    private String name;

    MessageType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
