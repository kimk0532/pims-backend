package com.skcc.pims.common.code.dto.response;

import com.skcc.pims.core.entity.Code;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CodeResponseDto {

    List<Code> codes;

}
