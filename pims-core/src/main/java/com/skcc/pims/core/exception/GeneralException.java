package com.skcc.pims.core.exception;

import lombok.Getter;

@Getter
public class GeneralException extends RuntimeException{

    private final CommonResponseStatus commonResponseStatus;
    private final Object data;

    public GeneralException(CommonResponseStatus commonResponseStatus) {
        super(commonResponseStatus.getMessage());
        this.commonResponseStatus = commonResponseStatus;
        this.data = null;
    }

    public GeneralException(CommonResponseStatus commonResponseStatus, Object data){
        super(commonResponseStatus.getMessage());
        this.commonResponseStatus = commonResponseStatus;
        this.data = data;
    }

}
