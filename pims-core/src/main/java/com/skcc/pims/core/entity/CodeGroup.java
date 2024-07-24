package com.skcc.pims.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CodeGroup {

    @Id
    @Column(name = "CODE_GROUP_ID")
    private String codeGroupId;

    @Column(name = "CODE_GROUP_NAME")
    private String codeGroupName;

    @Column(name = "IS_ENABLED")
    private Boolean isEnabled;

}
