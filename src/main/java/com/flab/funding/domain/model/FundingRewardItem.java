package com.flab.funding.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class FundingRewardItem {
    private Long id;
    private String funding_id;
    private String funding_reward_id;
    private String funding_item_id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
