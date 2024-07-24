package com.skcc.pims.common.code.dto.response;

import com.skcc.pims.core.entity.CodeGroup;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CodeGroupResponseDto {

    List<CodeGroup> codeGroups;

}
