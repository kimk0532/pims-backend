package com.skcc.pims.common.code.service;

import com.skcc.pims.common.code.dto.request.CodeRequestDto;
import com.skcc.pims.common.code.dto.response.CodeGroupResponseDto;
import com.skcc.pims.common.code.dto.response.CodeResponseDto;

public interface CodeService {

    CodeGroupResponseDto getAllCodeGroups();

    CodeResponseDto getCodeDetails(String codeGroupId);
}