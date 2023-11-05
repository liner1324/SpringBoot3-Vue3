package com.example.springboot3vue3.pojo.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author james
 * @created 2023/11/5 22:40
 */
@Data
@Builder
public class R <T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> R success(T data, String message) {
        return R.builder()
                .code(200)
                .data(data)
                .message(message)
                .build();
    }

    public static <T> R success(String message) {
        return R.builder()
                .code(200)
                .data(null)
                .message(message)
                .build();
    }

    public static <T> R failure(String message) {
        return R.builder()
                .code(500)
                .data(null)
                .message(message)
                .build();
    }

}
