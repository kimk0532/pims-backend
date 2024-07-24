package com.skcc.pims.core.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public CommonResponse<Object> handleApiException(GlobalException e) {
        e.printStackTrace();
        ResponseStatus responseStatus = e.getResponseStatus();

        return CommonResponse.builder()
                .code(responseStatus.getCode())
                .message(responseStatus.getMessage())
                .data(e.getData() != null ? e.getData() : null)
                .build();
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse<Object> handleException(Exception e) {
        e.printStackTrace();
        ResponseStatus responseStatus = ResponseStatus.UNEXPECTED_ERROR;

        return CommonResponse.builder()
                .code(responseStatus.getCode())
                .message(responseStatus.getMessage())
                .build();
    }

}