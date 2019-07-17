package com.lcp.medicalSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:27
 */
@Data
@AllArgsConstructor
public class Result implements Serializable {

    private int code;
    private String message;
    private Object data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
