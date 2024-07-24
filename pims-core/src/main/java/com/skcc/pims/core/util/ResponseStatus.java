package com.skcc.pims.core.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ResponseStatus {

    /**
     * code가 음수인 경우는 Error를 의미
     */
    OK(HttpStatus.OK, 200, "success"),
    UNEXPECTED_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -9999999, "예상치 못한 에러가 발생하였습니다.");

    private final HttpStatus status;
    private final Integer code;
    private final String message;

}
