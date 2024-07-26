package com.skcc.pims.core.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CommonResponse<T> {

    private final Integer code;
    private final T data;
    private final String message;
    private final LocalDateTime timestamp = LocalDateTime.now();

}
