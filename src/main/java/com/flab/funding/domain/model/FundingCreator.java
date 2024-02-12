package com.flab.funding.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class FundingCreator {
    private Long id;
    private String funding_id;
    private boolean valid;
    private String businessNum;
    private String representative;
    private String introduce;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
