package com.malone.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GolabelExceptionHandle{

    @ExceptionHandler(Exception.class)
    public void handle(Exception e){
        log.error("malone error",e);
    }
}
