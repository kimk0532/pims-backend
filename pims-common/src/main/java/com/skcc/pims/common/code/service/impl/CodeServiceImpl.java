package com.skcc.pims.common.code.service.impl;

import com.skcc.pims.common.code.dto.response.CodeGroupResponseDto;
import com.skcc.pims.common.code.dto.response.CodeResponseDto;
import com.skcc.pims.common.code.repository.CodeGroupRepository;
import com.skcc.pims.common.code.repository.CodeRepository;
import com.skcc.pims.common.code.service.CodeService;
import com.skcc.pims.core.entity.Code;
import com.skcc.pims.core.entity.CodeGroup;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService {

    private final CodeGroupRepository codeGroupRepository;
    private final CodeRepository codeRepository;

    /**
     * 모든 코드 그룹을 조회
     */
    @Override
    public CodeGroupResponseDto getAllCodeGroups() {
        List<CodeGroup> codeGroups = codeGroupRepository.findAll(Sort.by(Sort.Direction.ASC, "codeGroupId"));
        return CodeGroupResponseDto.builder()
                .codeGroups(codeGroups)
                .build();
    }

    /**
     * 코드 그룹에 해당하는 코드 리스트 조회
     */
    @Override
    public CodeResponseDto getCodeDetails(String codeGroupId) {
        List<Code> codes = codeRepository.findByCodeGroup_CodeGroupId(codeGroupId);
        return CodeResponseDto.builder()
                .codes(codes)
                .build();
    }
}