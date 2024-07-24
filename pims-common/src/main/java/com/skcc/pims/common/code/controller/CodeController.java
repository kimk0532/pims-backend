package com.skcc.pims.common.code.controller;

import com.skcc.pims.common.code.dto.request.CodeRequestDto;
import com.skcc.pims.common.code.dto.response.CodeGroupResponseDto;
import com.skcc.pims.common.code.dto.response.CodeResponseDto;
import com.skcc.pims.common.code.service.CodeService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/code")
@Tag(name = "Code", description = "코드 관리")
@RequiredArgsConstructor
public class CodeController {

    private final CodeService codeService;

    /**
     * 코드 그룹 조회
     */
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "코드 그룹 조회 성공"),
            @ApiResponse(responseCode = "500", description = "코드 그룹 조회 실패")
    })
    @GetMapping("/groups")
    public CodeGroupResponseDto getAllCodeGroups() {
        return codeService.getAllCodeGroups();
    }

    @Parameters({
        @Parameter(name = "codeGroupId", description = "코드 그룹 아이디", required = true)
    })
    @GetMapping("/groups/{codeGroupId}/details")
    public ResponseEntity<CodeResponseDto> getCodeDetails(@PathVariable String codeGroupId, @ModelAttribute CodeRequestDto request) {
        String codeGroupId2 = request.getCodeGroupId();
        log.info(codeGroupId2);
        return ResponseEntity.ok(codeService.getCodeDetails(codeGroupId));
    }

}
