package com.lcp.medicalSystem.config;

import com.lcp.medicalSystem.pojo.Code;
import com.lcp.medicalSystem.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * description: 全局异常处理
 * author: 沫凌
 * create: 2019-07-14 10:22
 */
@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {
    
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(Exception e,HttpServletRequest request){
        log.info("[出错路径：]"+request.getRequestURI());
        e.printStackTrace();
        return new Result(Code.ERROR,e.getMessage());
    }
}
