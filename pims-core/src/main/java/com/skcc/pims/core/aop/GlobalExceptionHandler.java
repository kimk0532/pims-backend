package com.skcc.pims.core.aop;

import com.skcc.pims.core.exception.GeneralException;
import com.skcc.pims.core.exception.CommonResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GeneralException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponseStatus handleGeneralException(GeneralException e) {
        e.printStackTrace();
        return e.getCommonResponseStatus();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponseStatus handleException(Exception e) {
        e.printStackTrace();
        e.
        return CommonResponseStatus.UNEXPECTED_ERROR;
    }

}