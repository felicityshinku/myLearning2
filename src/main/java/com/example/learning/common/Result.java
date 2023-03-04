package com.example.learning.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {

    private int code;
    private String msg;
    private Object data;

    // 数据查询---自定义消息
    public static Result success(String msg, Object data){
        return Result.builder().code(200).msg(msg).data(data).build();
    }

    // 数据查询---固定返回消息
    public static Result success(Object data){
        return Result.builder().code(200).msg("请求成功").data(data).build();
    }

    // 数据增删改
    public static Result success(){
        return Result.builder().code(200).msg("请求成功").build();
    }

}
