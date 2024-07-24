package com.skcc.pims.common.code.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CodeRequestDto {
    private String codeGroupId;
    private String testA;
    private String testB;
    private String testC;
    private String testD;
    private String testE;
}
