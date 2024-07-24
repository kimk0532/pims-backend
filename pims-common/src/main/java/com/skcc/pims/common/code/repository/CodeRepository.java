package com.skcc.pims.common.code.repository;

import com.skcc.pims.core.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeRepository extends JpaRepository<Code, String> {

    List<Code> findByCodeGroup_CodeGroupId(String codeGroupId);

}
