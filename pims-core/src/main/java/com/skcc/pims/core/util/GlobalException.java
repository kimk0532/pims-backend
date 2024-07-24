package com.skcc.pims.core.util;

import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException{

    private final ResponseStatus responseStatus;
    private final Object data;

    GlobalException(ResponseStatus responseStatus) {
        super(responseStatus.getMessage());
        this.responseStatus = responseStatus;
        this.data = null;
    }

    GlobalException(ResponseStatus responseStatus, Object data){
        super(responseStatus.getMessage());
        this.responseStatus = responseStatus;
        this.data = data;
    }

}
