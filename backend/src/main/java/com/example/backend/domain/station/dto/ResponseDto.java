package com.example.backend.domain.station.dto;

import com.example.backend.domain.station.entity.Station;
import com.example.backend.domain.toilet.entity.Toilet;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {
  private String station_name;
  private List<Toilet> toilets;
}
