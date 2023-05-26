package com.example.backend.domain.toilet.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ToiletResponse {
    private Long exitStation;
    private String location;
}
