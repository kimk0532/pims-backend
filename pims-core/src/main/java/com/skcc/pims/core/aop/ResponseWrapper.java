package com.skcc.pims.core.aop;

import com.skcc.pims.core.exception.CommonResponseStatus;
import com.skcc.pims.core.response.CommonResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(
    basePackages = "com.skcc.pims",
    basePackageClasses = GlobalExceptionHandler.class
)
public class ResponseWrapper implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class selectedConverterType,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {

        HttpServletResponse servletResponse =
                ((ServletServerHttpResponse) response).getServletResponse();
        int status = servletResponse.getStatus();
        HttpStatus resolve = HttpStatus.resolve(status);

        if(resolve == null) {
            return body;
        }

        if(resolve.is2xxSuccessful()) {
            return CommonResponse.builder()
                    .data(body)
                    .code(200)
                    .build();
        }

        if(body instanceof CommonResponseStatus){
            return CommonResponse.builder()
                    .code(((CommonResponseStatus) body).getCode())
                    .message(((CommonResponseStatus) body).getMessage())
                    .build();
        };

        return body;
    }

}
