package com.skcc.pims.core.entity;

import jakarta.persistence.*;

@Entity
public class Code {

    @Id
    @Column(name = "CODE_ID")
    private String codeId;

    @ManyToOne(fetch = FetchType.LAZY)
    private CodeGroup codeGroup;

    @Column(name = "CODE_NAME")
    private String codeName;

    @Column(name = "IS_ENABLED")
    private Boolean isEnabled;

}
